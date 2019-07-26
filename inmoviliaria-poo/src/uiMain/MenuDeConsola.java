package uiMain;

import java.util.*;

/**
 * MenuConsola
 */
public class MenuDeConsola {

	private static List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();

    public MenuDeConsola(List<OpcionDeMenu> opcionesNuevas){
		this.opciones = opcionesNuevas;
	}

	public void mostrarMenu(){
		int i = 1;
		for(OpcionDeMenu op : this.extracted()) {
			System.out.println(i+" "+op);
			i++;
		}
	}

	private List<OpcionDeMenu> extracted() {
		return opciones;
	}
}