package gestorAplicacion;

//import java.util.ArrayList;

public class Usuario {
	private Long cedula;
	private String nombre;
    private String correo;
    private String contrasena;
    private String direccion;
    
    
	public Usuario(Long cedula, String nombre, String correo, String contrasena, String direccion) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.correo=correo;
		this.contrasena=contrasena;
		this.direccion=direccion;
	}

	public Long getCedula() {
		return cedula;
	}
	
	public void setCedula(Long cedula) {
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

//----------------
	
	
}