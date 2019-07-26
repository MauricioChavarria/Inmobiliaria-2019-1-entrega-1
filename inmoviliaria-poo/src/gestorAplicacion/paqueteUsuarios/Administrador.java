package gestorAplicacion.paqueteUsuarios;

import gestorAplicacion.paqueteServicios.Inmueble;

//import java.awt.SystemTray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.LinkedList;
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
	
	public static void listarInmuebles() {
		for(int i=0; i<=Inmueble.inmuebles.size();i++) {
			 System.out.println("(Codigo: "+Inmueble.inmuebles.get(i).getcodigo_Inmueble()+", Antiguedad: "+Inmueble.inmuebles.get(i).getAntiguedad()+", Area: "+Inmueble.inmuebles.get(i).getArea()+", Ba�os: "+Inmueble.inmuebles.get(i).getBanos()+", Ciudad:"+Inmueble.inmuebles.get(i).getCiudad()+", Cuartos: "+Inmueble.inmuebles.get(i).getCuartos()+", Estrato: "+Inmueble.inmuebles.get(i).getEstrato()+", Predial: "+Inmueble.inmuebles.get(i).getPredial()+", Disponible: "+Inmueble.inmuebles.get(i).getDisponible()+")");
		 }
   }

	public static void eliminarFuncionario(int cedula){
		int i=0;
		for(Funcionario funcionario: Funcionario.funcionarios) {
			
			if(funcionario.getCedula()==cedula) {
				Funcionario.funcionarios.remove(i);
				System.out.println("Funcionario eliminado");
				return;
			}
			i++;
		}
		System.out.println("Funcionario no existe");
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