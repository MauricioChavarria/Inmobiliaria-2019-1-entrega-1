package uiMain.operaciones;

import java.util.Scanner;

import gestorAplicacion.paqueteServicios.Inmueble;
//import gestorAplicacion.paqueteUsuarios.Funcionario;
import uiMain.OpcionDeMenu;

public class buscarInmueblesEnVenta_o_EnArriendo extends OpcionDeMenu {

	private Scanner leer;

	@Override
	public void ejecutar() {
		leer = new Scanner(System.in);
		System.out.println("Ingrese \"enVenta\" para buscar inmuebles en venta \n"+"Ingrese \"enArriendo\" para buscar inmuebles en arriendo");
		String tipo = leer.next();
		Inmueble.buscarInmueblesEnVenta_o_EnArriendo(tipo);		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Buscar inmuebles en arriendo o en venta";
	}
	

}
