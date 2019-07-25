package gestorAplicacion.paqueteUsuarios;

import java.util.ArrayList;

import uiMain.*;

//import java.util.ArrayList;

public abstract class Usuario {
	private int cedula;
	private String nombre;
	private String correo;
	private String contrasena;
	private String direccion;
	public ArrayList<OpcionDeMenu> options = new ArrayList<OpcionDeMenu> ();
	
	public Usuario(int cedula, String nombre, String correo, String contrasena, String direccion, String tipoUsuario) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.correo=correo;
		this.contrasena=contrasena;
		this.direccion=direccion;
		tipoUsuario = "3";
	}

	public int getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
