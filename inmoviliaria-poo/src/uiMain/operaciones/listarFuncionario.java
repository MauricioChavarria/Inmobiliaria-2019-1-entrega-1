package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import gestorAplicacion.paqueteUsuarios.Funcionario;
import uiMain.OpcionDeMenu;

public class listarFuncionario extends OpcionDeMenu{
	@Override
	public void ejecutar () {
		Administrador.listarFuncionarios();
	}

	@Override
	public String toString() {
		return "Listar Funcionario";
	}
}
