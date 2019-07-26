package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class ListarCliente extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		Administrador.listarClientes();
	}

	@Override
	public String toString() {
		return "Listar todos los clientes";
	}

}
