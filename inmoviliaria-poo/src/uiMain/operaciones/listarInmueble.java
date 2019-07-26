package uiMain.operaciones;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class listarInmueble extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		Administrador.listarInmuebles();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Lista de todos los Inmuebles";
	}

}
