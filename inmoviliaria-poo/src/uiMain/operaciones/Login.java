package uiMain.operaciones;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import gestorAplicacion.paqueteUsuarios.Administrador;
import gestorAplicacion.paqueteUsuarios.Cliente;
import gestorAplicacion.paqueteUsuarios.Funcionario;
//import gestorAplicacion.paqueteUsuarios.Usuario;
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
		Funcionario fun = Funcionario.login(cedula, password);
		Cliente cli = Cliente.login(cedula, password);
		if(admin != null){
			usuarioEntontrado = true;
			admin.setLogin(true);
			
			List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
			//Funciones de administrador
			opciones.add(new Registrar());
			opciones.add(new ListarAdmin());
			opciones.add(new ListarFuncionario());
			opciones.add(new ListarCliente());
			
			MenuDeConsola menu = new MenuDeConsola(opciones);
		}else if(fun != null){
			usuarioEntontrado = true;
			fun.setLogin(true);
			
			List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
			//Funciones de administrador
			opciones.add(new Registrar());
			opciones.add(new ListarCliente());
			opciones.add(new ListarInmueble());
			
			MenuDeConsola menu = new MenuDeConsola(opciones);
			
		}else if(cli != null){
			usuarioEntontrado = true;
			cli.setLogin(true);
			
			List<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
			//Funciones de administrador
			opciones.add(new ListarCliente());
			opciones.add(new AddInmueble());
			opciones.add(new BuscarInmueblesEnVenta_o_EnArriendo());
			
			MenuDeConsola menu = new MenuDeConsola(opciones);
		}else {			
			System.out.println("El usuario no existe");
		}		
	}

	@Override
	public String toString() {
		return "Iniciar sesion";
	}

}
