package uiMain;

import java.io.Serializable;
import java.util.*;

/**
 * MenuConsola
 */
public class MenuDeConsola implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	public static List<MenuDeConsola> stackMenu = new ArrayList<MenuDeConsola>();

    public MenuDeConsola(List<OpcionDeMenu> opcionesNuevas){
		this.opciones = opcionesNuevas;
		//Se agrega el menu actual con sus respectivas opciones
		stackMenu.add(this);
	}

	public void mostrarMenu(){
		int i = 1;
		for(OpcionDeMenu op : this.getOpciones()) {
			System.out.println(i+" "+op);
			i++;
		}
	}

	public List<OpcionDeMenu> getOpciones() {
		return opciones;
	}
}