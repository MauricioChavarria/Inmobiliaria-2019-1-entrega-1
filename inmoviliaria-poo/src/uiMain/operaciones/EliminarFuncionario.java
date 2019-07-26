package uiMain.operaciones;

import java.util.Scanner;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.OpcionDeMenu;

public class EliminarFuncionario extends OpcionDeMenu{

	private Scanner leer;

	@Override
	public void ejecutar() {
		leer = new Scanner(System.in);
		System.out.println("Ingrese numero de cedula: ");
		int cedula = leer.nextInt();
		Administrador.eliminarFuncionario(cedula);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Eliminar Funcionario";
	}
	
}
