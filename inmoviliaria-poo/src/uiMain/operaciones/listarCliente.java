package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class listarCliente extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		Administrador.listarClientes();
	}

	@Override
	public String toString() {
		return "Listar todos los clientes";
	}

}
