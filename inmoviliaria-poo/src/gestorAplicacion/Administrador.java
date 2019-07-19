package gestorAplicacion;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {

    public static List<Administrador> admins = new ArrayList<Administrador>();

	public Administrador(Long cedula, String nombre, String correo, String contrasena, String direccion) {
		super(cedula, nombre, correo, contrasena, direccion);
	}
	
	public static Administrador editarCampo(){
		return null;
	}
	public static Administrador agregarCampo(){
		return null;
	}
	public static Administrador eliminarCampo(){
		return null;
	}
	public static Administrador agregarFuncionario(){
		return null;
	}

}
