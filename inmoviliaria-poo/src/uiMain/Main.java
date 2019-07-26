package uiMain;

import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.Scanner;

import gestorAplicacion.paqueteServicios.*;
import gestorAplicacion.paqueteUsuarios.*;
import uiMain.operaciones.*;
import baseDeDatos.*;

class Main {
	
	static LinkedList<OpcionDeMenu> opciones = new LinkedList<OpcionDeMenu>();
	public static MenuDeConsola menu;
	
	public static void main(String[] args) throws IOException  {
		
		//Obtener data y cargar
		
		Administrador test = new Administrador(111, "Admin1", "admin1@admin.com", "123", "mi casa1");
		// Cliente test1 = new Cliente(1234, "Client", "client@admin.com", "123", "mi casa");
		// Funcionario test2 = new Funcionario(12345, "Client", "client@admin.com", "123", "mi casa", 123L, 123L, test1);
		// Inmueble test3 = new Inmueble(123456, 123, 123, true, true, 50, 2, 2, "feo", null, "medellin", 90, true);
		// Arriendo test4 = new Arriendo(123, new Date(0), 2.0, test3, true, "si", new Date(1));
		// Compraventa test5 = new Compraventa(12123123, new Date(0), 0, test3, false, null);
		// Contrato test6 = new Contrato(123,new Date(0), 2.0, test3, true);
		
		SerializerData data = new SerializerData();
		System.out.println("SIZE: "+Administrador.admins.size());
		System.out.println(Administrador.admins.get(0).getCedula()+" - "+Administrador.admins.get(0).getContrasena());
		
		//Menu inicial
		opciones.add(new Login());
		opciones.add(new Registrar());
		
		menu = new MenuDeConsola(opciones);
		
		while(true){
			//Siempre ejecuta el ultimo menu al que se entró
			MenuDeConsola.stackMenu.get(MenuDeConsola.stackMenu.size()-1).mostrarMenu();
			
			System.out.println((MenuDeConsola.stackMenu.get(MenuDeConsola.stackMenu.size()-1).getOpciones().size()+1)+" Salir.");
			System.out.print("Ingrese una opcion: ");
			Scanner entrada = new Scanner(System.in);
			
			int op = entrada.nextInt();
			try{
				MenuDeConsola.stackMenu.get(MenuDeConsola.stackMenu.size()-1).getOpciones().get(op-1).ejecutar();
			}catch(Exception e){
				if(MenuDeConsola.stackMenu.size() > 1){
					MenuDeConsola.stackMenu.remove(MenuDeConsola.stackMenu.size()-1);
				}else{
					break;					
				}
			}
			
		}
		
		data.finalize();


	}

}
