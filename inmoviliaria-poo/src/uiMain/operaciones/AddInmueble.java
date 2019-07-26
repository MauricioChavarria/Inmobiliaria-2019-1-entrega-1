package uiMain.operaciones;

import java.util.Scanner;

import gestorAplicacion.paqueteServicios.Inmueble;
//import gestorAplicacion.paqueteUsuarios.Funcionario;
import uiMain.OpcionDeMenu;

public class AddInmueble extends OpcionDeMenu{

	private Scanner leer;

	@Override
	public void ejecutar() {
		leer = new Scanner(System.in);
		System.out.print("Ingrese codigo: ");
		int cod = leer.nextInt();
		System.out.print("Ingrese predia: ");
		int pred = leer.nextInt();
		System.out.print("Ingrese estrato: ");
		int estr = leer.nextInt();
		System.out.print("Ingrese vigilancia: ");
		boolean vig = leer.next() != null;
		System.out.print("Ingrese ascensor: ");
		boolean asc = leer.next() != null;
		System.out.print("Ingrese area: ");
		int area = leer.nextInt();
		System.out.print("Ingrese baños: ");
		int banos = leer.nextInt();
		System.out.print("Ingrese cuartos: ");
		int cuartos = leer.nextInt();
		System.out.print("Ingrese tipo: (\"enVenta\", \"enArriendo\")");
		String tipo = leer.next();
		System.out.print("Ingrese ciudad");
		String ciudad = leer.next();
		System.out.print("Ingrese antiguedad");
		int ant = leer.nextInt();
		System.out.print("Ingrese disponibilidad: ");
		boolean dis = leer.next() != null;
		
		new Inmueble(cod, pred, estr, vig, asc,area,banos, cuartos, tipo, null, ciudad, ant, dis);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Agregar inmuble";
	}

}
