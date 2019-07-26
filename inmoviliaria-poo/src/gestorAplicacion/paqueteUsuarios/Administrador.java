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
			 System.out.println("("+Funcionario.funcionarios.get(i).getNombre()+", "+Funcionario.funcionarios.get(i).getCedula()+", "+Funcionario.funcionarios.get(i).getCorreo()+", "+Funcionario.funcionarios.get(i).getDireccion()+", "+Funcionario.funcionarios.get(i).getSueldo()+", "+Funcionario.funcionarios.get(i).getComision()+")");
		 }
	}
	
	public static void listarClientes() {
		for(int i=0; i<=Cliente.clientes.size();i++) {
			 System.out.println("("+Cliente.clientes.get(i).getNombre()+", "+Cliente.clientes.get(i).getCedula()+", "+Cliente.clientes.get(i).getCorreo()+", "+Cliente.clientes.get(i).getDireccion()+")");
		 }
   }
	
	public static void listarAdministradores() {
		for(int i=0; i<=Administrador.admins.size();i++) {
			 System.out.println("("+Administrador.admins.get(i).getNombre()+", "+Administrador.admins.get(i).getCedula()+", "+Administrador.admins.get(i).getCorreo()+", "+Administrador.admins.get(i).getDireccion()+")");
		 }
   }
	
	public static LinkedList<Inmueble> listarInmuebles(LinkedList<Inmueble> todos_Inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_Inmuebles) {
        	inmuebles_encontrados.add(iterado);
        }
        return inmuebles_encontrados;
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