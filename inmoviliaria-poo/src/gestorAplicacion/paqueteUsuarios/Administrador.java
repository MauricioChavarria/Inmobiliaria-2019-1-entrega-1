package gestorAplicacion.paqueteUsuarios;

import gestorAplicacion.paqueteServicios.Inmueble;

import java.awt.SystemTray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Administrador extends Usuario implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static List<Administrador> admins = new ArrayList<Administrador>();
    

	public Administrador(int cedula, String nombre, String correo, String contrasena, String direccion) {
		
		super(cedula, nombre, correo, contrasena, direccion);
		
		admins.add(this);
	}
	
	public static void listarFuncionarios(){
		 for(int i=0; i<=Funcionario.funcionarios.size();i++) {
			 System.out.println("(Nombre: "+Funcionario.funcionarios.get(i).getNombre()+", Cedula: "+Funcionario.funcionarios.get(i).getCedula()+", Correo: "+Funcionario.funcionarios.get(i).getCorreo()+", Direccion: "+Funcionario.funcionarios.get(i).getDireccion()+", Sueldo: "+Funcionario.funcionarios.get(i).getSueldo()+", Comision: "+Funcionario.funcionarios.get(i).getComision()+")");
		 }
	}
	
	public static void listarClientes() {
		for(int i=0; i<=Cliente.clientes.size();i++) {
			System.out.println("(Nombre: "+Cliente.clientes.get(i).getNombre()+", Cedula: "+Cliente.clientes.get(i).getCedula()+", Correo: "+Cliente.clientes.get(i).getCorreo()+", Direccion: "+Cliente.clientes.get(i).getDireccion()+")");
		}
	}
	
	public static void listarAdministradores() {
		for(int i=0; i<=Administrador.admins.size();i++) {
			 System.out.println("(Nombre: "+Administrador.admins.get(i).getNombre()+", Cedula: "+Administrador.admins.get(i).getCedula()+", Correo: "+Administrador.admins.get(i).getCorreo()+", Direccion: "+Administrador.admins.get(i).getDireccion()+")");
		 }
   }
	
	public static void listarInmuebles() {
		for(int i=0; i<=Inmueble.inmuebles.size();i++) {
			 System.out.println("(Codigo: "+Inmueble.inmuebles.get(i).getcodigo_Inmueble()+", Antiguedad: "+Inmueble.inmuebles.get(i).getAntiguedad()+", Area: "+Inmueble.inmuebles.get(i).getArea()+", Baños: "+Inmueble.inmuebles.get(i).getBanos()+", Ciudad:"+Inmueble.inmuebles.get(i).getCiudad()+", Cuartos: "+Inmueble.inmuebles.get(i).getCuartos()+", Estrato: "+Inmueble.inmuebles.get(i).getEstrato()+", Predial: "+Inmueble.inmuebles.get(i).getPredial()+", Disponible: "+Inmueble.inmuebles.get(i).getDisponible()+")");
		 }
   }
	
	public static void addFuncionario(Funcionario f){
		 Funcionario.funcionarios.add(f);
	}
	
	public static Administrador getAdministrador(int cc,List<Administrador> admins) {
        return admins.get(cc);
	}		
	
	public static Administrador login(int cedula, String contrasena) {
        
		System.out.println("-----------------------");
        for(Administrador a: admins){
        	System.out.println((a.getCedula()== cedula)+" - "+(a.getContrasena().equals(contrasena)));
            if(a.getCedula() == cedula && a.getContrasena().equals(contrasena)){
                return a;
            }
        }
        System.out.println("-----------------------");
       return null;
   }

   @Override
	public void ejecutar() {
		System.out.println("1: Listar funcionarios\n:");
	}

	@Override
	public String toString() {
        return "Opciones de Administrador";	
	}
}