package uiMain;

import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.Scanner;

import gestorAplicacion.paqueteServicios.Arriendo;
import gestorAplicacion.paqueteServicios.Compraventa;
import gestorAplicacion.paqueteServicios.Contrato;
import gestorAplicacion.paqueteServicios.Inmueble;
import gestorAplicacion.paqueteUsuarios.Administrador;
import gestorAplicacion.paqueteUsuarios.Cliente;
import gestorAplicacion.paqueteUsuarios.Funcionario;
import gestorAplicacion.paqueteUsuarios.Usuario;
import uiMain.operaciones.*;
import baseDeDatos.*;

class Main {
	
	static LinkedList<OpcionDeMenu> opciones = new LinkedList<OpcionDeMenu>();
	
	public static void main(String[] args) throws IOException  {
		
		//Obtener data y cargar
		
		//Administrador test = new Administrador(123, "Admin", "admin@admin.com", "123", "mi casa");
		Cliente test1 = new Cliente(1234, "Client", "client@admin.com", "123", "mi casa");
		Funcionario test2 = new Funcionario(12345, "Client", "client@admin.com", "123", "mi casa", 123L, 123L, test1);
		Inmueble test3 = new Inmueble(123456, 123, 123, true, true, 50, 2, 2, "feo", null, "medellin", 90, true);
		Arriendo test4 = new Arriendo(123, new Date(0), 2.0, test3, true, "si", new Date(1));
		Compraventa test5 = new Compraventa(12123123, new Date(0), 0, test3, false, null);
		Contrato test6 = new Contrato(123,new Date(0), 2.0, test3, true);
		
		SerializerData data = new SerializerData();
		//data.finalize();
		
		System.out.print(Administrador.admins.get(0).getNombre());
		
		
		opciones.push(new Login());
		
		MenuDeConsola menu = new MenuDeConsola(opciones);
		menu.mostrarMenu();
		
		System.out.println("Ingrese una opcion: ");
		Scanner entrada = new Scanner(System.in);
		
		int op = entrada.nextInt();
		
		opciones.get(op-1).ejecutar();


	}

}
