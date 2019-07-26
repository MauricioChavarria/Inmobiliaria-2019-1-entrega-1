package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class ListarAdmin extends OpcionDeMenu{

	@Override
	public void ejecutar() {
		Administrador.listarAdministradores();
		System.out.println("No se regrese, por favor");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Listar todos los Administradores";
	}

}
