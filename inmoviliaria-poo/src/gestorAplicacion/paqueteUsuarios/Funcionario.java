package gestorAplicacion.paqueteUsuarios;

//import gestorAplicacion.paqueteServicios.Inmueble;
import gestorAplicacion.paqueteServicios.Contrato;

import java.io.Serializable;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class Funcionario extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long sueldo;
	private Long comision;
	
    public static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Funcionario(int cedula, String nombre, String correo, String contrasena, String direccion, Long sueldo, Long comision) {
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

	public static void eliminarCliente(int cedula){
		int i=0;
		for(Cliente cliente: Cliente.clientes) {
			
			if(cliente.getCedula()==cedula) {
				Funcionario.funcionarios.remove(i);
				System.out.println("Cliente eliminado");
				return;
			}
			i++;
		}
		System.out.println("Cliente no existe");
	}
	public static void eliminarContrato(int codigo){
		int i=0;
		for(Contrato contrato: Contrato.contratos) {
			
			if(contrato.getCodigo()==codigo) {
				Funcionario.funcionarios.remove(i);
				System.out.println("Contrato eliminado");
				return;
			}
			i++;
		}
		System.out.println("Contrato no existe");
	}
	public static Funcionario getFuncionario(int cc,List<Funcionario> funcionarios) {
		return funcionarios.get(cc);
	}
	public static Funcionario login(int cedula, String contrasena) {
	        
		System.out.println("-----------------------");
        for(Funcionario f: funcionarios){
            if(f.getCedula() == cedula && f.getContrasena().equals(contrasena)){
                return f;
            }
        }
        System.out.println("-----------------------");
       return null;
    }
}

