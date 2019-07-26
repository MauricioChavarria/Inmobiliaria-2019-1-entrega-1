package uiMain.operaciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import gestorAplicacion.paqueteUsuarios.Administrador;
import gestorAplicacion.paqueteUsuarios.Cliente;
import gestorAplicacion.paqueteUsuarios.Funcionario;
import gestorAplicacion.paqueteUsuarios.Usuario;
import uiMain.MenuDeConsola;
import uiMain.OpcionDeMenu;

public class Registrar extends OpcionDeMenu{

	private boolean usuarioEntontrado = false;

	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese numero de cedula: ");
		int cedula = leer.nextInt();
		System.out.print("Ingrese nombre: ");
		String nombre = leer.next();
		System.out.print("Ingrese correo: ");
		String correo = leer.next();
		System.out.print("Ingrese contrasena: ");
		String contrasena = leer.next();
		System.out.print("Ingrese direccion: ");
		String direccion = leer.next();
		
		boolean encontrado=false;
		//Buscar en cada uno de los tipos de usuarios
		if(encontrado=false) {
			for(int i=0; i<=Administrador.admins.size(); i++) {
				if (cedula == Administrador.admins.get(i).getCedula()) {
					System.out.println("Este Usuario ya existe");
					encontrado=true;
				}
			}
		}
		if(encontrado=false) {
			for(int i=0; i<=Funcionario.funcionarios.size(); i++) {
				if (cedula == Funcionario.funcionarios.get(i).getCedula()) {
					System.out.println("Este Usuario ya existe");
					encontrado=true;
				}
			}
		}
		if(encontrado=false) {
			for(int i=0; i<=Cliente.clientes.size(); i++) {
				if (cedula == Cliente.clientes.get(i).getCedula()) {
					System.out.println("Este Usuario ya existe");
					encontrado=true;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Iniciar sesión";
	}

}
