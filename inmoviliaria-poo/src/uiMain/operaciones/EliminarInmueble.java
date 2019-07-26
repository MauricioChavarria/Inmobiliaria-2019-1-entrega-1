package uiMain.operaciones;

import java.util.Scanner;

import gestorAplicacion.paqueteUsuarios.Funcionario;
import uiMain.OpcionDeMenu;

public class EliminarInmueble extends OpcionDeMenu{

	private Scanner leer;

	@Override
	public void ejecutar() {
		leer = new Scanner(System.in);
		System.out.println("Ingrese codigo del inmueble: ");
		int codigo = leer.nextInt();
		Funcionario.eliminarCliente(codigo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Eliminar inmueble";
	}
}