package gestorAplicacion.paqueteUsuarios;

import java.io.Serializable;

import uiMain.OpcionDeMenu;

public class Usuario extends OpcionDeMenu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cedula;
	private String nombre;
	private String correo;
	private String contrasena;
	private String direccion;
	private Boolean login = false;

	public Usuario(int cedula, String nombre, String correo, String contrasena, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.direccion = direccion;
	}

	public Boolean getLogin() {
		return login;
	}

	public void setLogin(Boolean login) {
		this.login = login;
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

	@Override
	public void ejecutar() {

	}

	@Override
	public String toString() {
		return null;
	}

}
