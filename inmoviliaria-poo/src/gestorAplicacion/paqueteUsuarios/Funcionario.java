package gestorAplicacion.paqueteUsuarios;

import gestorAplicacion.paqueteServicios.Inmueble;
import gestorAplicacion.paqueteServicios.Contrato;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Funcionario extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
			if(f.getCedula()== cedula && f.getContrasena().equals(contrasena)){
				return f;
            }
		}
		return null;
    }
}

