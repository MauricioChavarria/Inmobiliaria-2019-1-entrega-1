package gestorAplicacion;

import java.util.LinkedList;

public class Usuario_Invitado extends Usuario {
	
	public Usuario_Invitado(Long cedula, String nombre, String correo, String contrasena, String direccion) {
		super(cedula, nombre, correo, contrasena, direccion);
	}
	
	public static LinkedList<Inmueble> verInmueble(LinkedList<Inmueble> todos_inmuebles){
		return Inmueble.verInmueblesDisponibles(todos_inmuebles);
	}
	
}
