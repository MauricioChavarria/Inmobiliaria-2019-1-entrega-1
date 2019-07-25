package uiMain.operations;

import java.util.HashMap;
import java.util.Scanner;

import gestorAplicacion.paqueteUsuarios.Administrador;
import gestorAplicacion.paqueteUsuarios.Usuario;
import uiMain.MenuDeConsola;
import uiMain.OpcionDeMenu;

public class Login extends OpcionDeMenu{
	
	protected Login() {
		super("----Menú principal----");
	}

	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su numero de cedula: ");
		int cedula = leer.nextInt();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		
		//Buscar en cada uno de los tipos de usuarios
		for(Administrador admin: Administrador.admins){
			if(admin.login(cedula,password) != null){
				HashMap<String,OpcionDeMenu> subopt = new HashMap<String,OpcionDeMenu>();
				subopt.put("1", )
				/* 
					NOTA: Desarrollar la clase que instancia de administrador y de opcion menu
					para que esta sea una operacion en el menu de consola
				
				*/

				MenuDeConsola menu = new Menu
			}
		}
		
		
	}

	@Override
	public String toString() {
		return "Iniciar sesión";
	}

}
