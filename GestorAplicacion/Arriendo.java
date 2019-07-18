package GestorAplicacion;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Arriendo extends Contrato{
    
	private Date fechaInicio;
	private Date fechafin;
    private Funcionario funcionario;
    
    public Arriendo(int codigo,Date fecha,Long valor,Inmueble inmueble, Cliente cliente, boolean disponible, Date fechaInicio, Date fechafin, Funcionario funcionario) {
        super(codigo,fecha,valor,inmueble, cliente, disponible);
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.funcionario = funcionario;
    }

    
    /*@Override
    public String toString() {
        return "Arriendo{" + "arrendatario=" + arrendatario + ", agencia=" + agencia + ", fechafin=" + fechafin + '}';
    }*/

    public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

    public static LinkedList<Arriendo> arriendosDisponibles(HashMap<Integer, Arriendo> arriendos){
        LinkedList<Arriendo> disponibles = new LinkedList<>();
        for (Arriendo a1 : arriendos.values()) {
            if(a1.getDisponible()){
                disponibles.add(a1);
            }
        }
        if(disponibles.isEmpty()){
            return null;
        }
        return disponibles;
        
    }

}
