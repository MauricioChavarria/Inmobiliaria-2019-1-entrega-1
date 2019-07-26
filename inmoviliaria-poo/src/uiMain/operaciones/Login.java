package uiMain.operaciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import gestorAplicacion.paqueteUsuarios.Administrador;
import gestorAplicacion.paqueteUsuarios.Usuario;
import uiMain.MenuDeConsola;
import uiMain.OpcionDeMenu;

public class Login extends OpcionDeMenu{

	private boolean usuarioEntontrado = false;

	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su numero de cedula: ");
		int cedula = leer.nextInt();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		
		//Buscar en cada uno de los tipos de usuarios
		Administrador admin = Administrador.login(cedula,password);
		if(admin != null){
			usuarioEntontrado = true;
			admin.setLogin(true);

			List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
			//Funciones de administrador
			opciones.add(new Registrar());
			opciones.add(null);
			
			MenuDeConsola menu = new MenuDeConsola(opciones);
		}else {			
			System.out.println("El usuario no existe");
		}
		System.out.println("\n");
	}

	@Override
	public String toString() {
		return "Iniciar sesión";
	}

}
