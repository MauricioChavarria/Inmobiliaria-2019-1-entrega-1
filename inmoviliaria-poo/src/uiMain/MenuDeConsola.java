package uiMain;

import java.util.*;

/**
 * MenuConsola
 */
public class MenuDeConsola {

	HashMap<String,OpcionDeMenu> opciones = new HashMap<String,OpcionDeMenu>();

    public MenuDeConsola(HashMap<String,OpcionDeMenu> opcionesNuevas){
		this.opciones = opcionesNuevas;
	}

	public void mostrarMenu(){
		int i = 1;
		for(Map.Entry<String, OpcionDeMenu> op : this.opciones.entrySet() ){
			System.out.println(i+" "+op.getValue());
			i++;
		}
	}
}