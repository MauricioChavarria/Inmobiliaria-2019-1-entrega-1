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
	
	public static LinkedList<Funcionario> listarFuncionarios(LinkedList<Funcionario> todos_funcionarios){
		 LinkedList<Funcionario> funcionarioa_encontrados = new LinkedList<Funcionario>();
	        for (Funcionario iterado : todos_funcionarios) {
	        	funcionarioa_encontrados.add(iterado);
	        }
	        return funcionarioa_encontrados;
	}
	
	public static LinkedList<Cliente> listarClientes(LinkedList<Cliente> todos_clientes) {
        LinkedList<Cliente> clientes_encontrados = new LinkedList<Cliente>();
        for (Cliente iterado : todos_clientes) {
        	clientes_encontrados.add(iterado);
        }
        return clientes_encontrados;
    }
	
	public static LinkedList<Administrador> listarAdministradores(LinkedList<Administrador> todos_admins) {
        LinkedList<Administrador> admins_encontrados = new LinkedList<Administrador>();
        for (Administrador iterado : todos_admins) {
        	admins_encontrados.add(iterado);
        }
        return admins_encontrados;
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