package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class ListarAdmin extends OpcionDeMenu{

	@Override
	public void ejecutar() {
		Administrador.listarAdministradores();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Listar todos los Administradores";
	}

}
