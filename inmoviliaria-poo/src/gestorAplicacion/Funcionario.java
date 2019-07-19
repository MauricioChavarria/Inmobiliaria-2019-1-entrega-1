package gestorAplicacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Funcionario extends Usuario {
	
	private Long sueldo;
	private Long comision;
	
    public static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Funcionario(Long cedula, String nombre, String correo, String contrasena, String direccion, Long sueldo, Long comision, Cliente clientes) {
		super(cedula, nombre, correo, contrasena, direccion);
		this.sueldo=sueldo;;
		this.comision=comision;
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
        for (int i=0; i<=Cliente.clientes.size(); i++) {
        	clientes_encontrados.add(Cliente.clientes.get(i));
        }
        return clientes_encontrados;
    }
	
	 public static LinkedList<Inmueble> listaInmuebles(LinkedList<Inmueble> todos_inmuebles){
			return Inmueble.verInmueblesDisponibles(todos_inmuebles);
		}
	 public static void agregarCliente(Cliente p){
		 Cliente.clientes.add(p);
	    }
	 public static void addContrato(Contrato p){
	        Contrato.contratos.add(p);
	    }
}
