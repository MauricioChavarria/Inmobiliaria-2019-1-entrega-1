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
		Usuario user = Administrador.login(cedula,password);
		if(user != null){
			usuarioEntontrado = true;
			user.setLogin(true);

			List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
			opciones.add(user);
			
			MenuDeConsola menu = new MenuDeConsola(opciones);
			menu.mostrarMenu();
		}
	}

	@Override
	public String toString() {
		return "Iniciar sesión";
	}

}
