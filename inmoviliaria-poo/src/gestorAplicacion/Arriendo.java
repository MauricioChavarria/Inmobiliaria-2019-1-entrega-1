package gestorAplicacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Arriendo extends Contrato{
    
    private String agencia;
    private Date fechafin;

    public static List<Arriendo> arriendos = new ArrayList<Arriendo>();
    
    public Arriendo(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago, String agencia, Date fechafin) {
        super(codigo,fecha,valor,inmueble,disponible);
        this.agencia = agencia;
        this.fechafin = fechafin;
    }

    
    @Override
    public String toString() {
        return "Arriendo{" + ", agencia=" + agencia + ", fechafin=" + fechafin + '}';
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia.trim();
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    public static LinkedList<Arriendo> arriendosDisponibles(HashMap<Integer, Arriendo> arriendos){
        LinkedList<Arriendo> disponibles = new LinkedList<Arriendo>();
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
