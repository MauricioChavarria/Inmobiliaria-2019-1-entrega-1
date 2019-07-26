package gestorAplicacion.paqueteUsuarios;

import gestorAplicacion.paqueteServicios.Inmueble;
import gestorAplicacion.paqueteServicios.Contrato;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Funcionario extends Usuario {
	
	private Long sueldo;
	private Long comision;
	
    public static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Funcionario(int cedula, String nombre, String correo, String contrasena, String direccion, Long sueldo, Long comision, Cliente clientes) {
		super(cedula, nombre, correo, contrasena, direccion);
		this.sueldo=sueldo;
		this.comision=comision;
		
		funcionarios.add(this);
	}

	public Long getSueldo() {
		return sueldo;
	}

	public void setSueldo(Long sueldo) {
		this.sueldo = sueldo;
	}

	public Long getComision() {
		return comision;
	}

	public void setComision(Long comision) {
		this.comision = comision;
	}


	public static LinkedList<Cliente> listarClientes(LinkedList<Cliente> todos_clientes) {
        LinkedList<Cliente> clientes_encontrados = new LinkedList<Cliente>();
        for (Cliente iterado : todos_clientes) {
        	clientes_encontrados.add(iterado);
        }
        return clientes_encontrados;
    }
	
	 public static LinkedList<Inmueble> listarInmuebles(LinkedList<Inmueble> todos_inmuebles){
		 LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
	        for (Inmueble iterado : todos_inmuebles) {
	        	inmuebles_encontrados.add(iterado);
	        }
	        return inmuebles_encontrados;
		}
	 public static void addCliente(Cliente p){
		 Cliente.clientes.add(p);
	    }
	 public static void addContrato(Contrato p){
	        Contrato.contratos.add(p);
	    }
	 public static Funcionario getFuncionario(int cc,List<Funcionario> funcionarios) {
	        return funcionarios.get(cc);
	    }
	 public static Funcionario login(int cedula, String contrasena, ArrayList<Funcionario> Funcionarios) {
	        
         for(Funcionario f: funcionarios){
             if(f.getCedula()== cedula && f.getContrasena()==contrasena){
                 return f;
             }
         }
        return null;
    }
}

