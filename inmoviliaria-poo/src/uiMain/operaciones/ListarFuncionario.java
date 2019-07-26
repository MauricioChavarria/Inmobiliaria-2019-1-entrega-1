package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class ListarFuncionario extends OpcionDeMenu{
	@Override
	public void ejecutar () {
		Administrador.listarFuncionarios();
	}

	@Override
	public String toString() {
		return "Listar toddos los Funcionario";
	}
}
