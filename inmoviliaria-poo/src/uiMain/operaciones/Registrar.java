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

	@Override
	public void ejecutar() {
		System.out.println("\n-----Registro de usuarios------");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese numero de cedula: ");
		int cedula = leer.nextInt();
		
		boolean encontrado=false;
		//Buscar en cada uno de los tipos de usuarios
		System.out.println("Buscando en Administradores...");
		for(int i=0; i<Administrador.admins.size(); i++) {
			if (cedula == Administrador.admins.get(i).getCedula()) {				
				encontrado=true;
			}
		}
		
		if(!encontrado) {
			for(int i=0; i<Funcionario.funcionarios.size(); i++) {
				if (cedula == Funcionario.funcionarios.get(i).getCedula()) {					
					encontrado=true;
				}
			}
		}
		if(!encontrado) {
			for(int i=0; i<Cliente.clientes.size(); i++) {
				if (cedula == Cliente.clientes.get(i).getCedula()) {
					encontrado=true;
				}
			}
		}
		
		
		if(encontrado){
			System.out.println("Este Usuario ya existe\n");
			return;
		}
		System.out.println("Ingrese nombre: ");
		String nombre = leer.next();
		System.out.println("Ingrese correo: ");
		String correo = leer.next();
		System.out.println("Ingrese contraseña: ");
		String contrasena = leer.next();
		System.out.println("Ingrese dirección: ");
		String direccion = leer.next();
		System.out.println("Seleccione rol, \n 1 -> Administrador \n 2 -> Cliente \n 3 -> Funcionario");
		int rol = leer.nextInt();	
		
		if(!encontrado) {
			switch(rol) {
			case 1:
				new Administrador(cedula, nombre, correo, contrasena,direccion);
				break;
			case 2:
				new Cliente(cedula, nombre, correo, contrasena,direccion);
				break;
			case 3:
				Cliente clienteEncontrado = null;
				
				System.out.println("Ingrese sueldo: ");
				Long sueldo = leer.nextLong();
				System.out.println("Ingrese comision: ");
				Long comision = leer.nextLong();
				System.out.println("Ingrese cedula de cliente: ");
				int cliente = leer.nextInt();
				
				for(int i=0; i<=Cliente.clientes.size(); i++) {
					if (cliente == Cliente.clientes.get(i).getCedula()) {
						clienteEncontrado = Cliente.clientes.get(i);
					}
				}
				
				new Funcionario(cedula, nombre, correo, contrasena,direccion,sueldo,comision,clienteEncontrado);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Registrar usuario";
	}

}
