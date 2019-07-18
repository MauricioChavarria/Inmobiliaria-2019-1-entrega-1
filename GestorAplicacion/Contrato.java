package GestorAplicacion;
import java.util.ArrayList;
import java.util.Date;
//import java.util.HashMap;
//import java.util.LinkedList;
import java.util.List;

public class Contrato {

    private int codigo;
    private Date fecha;
    private Long valor;
    private Inmueble inmueble;
    private Cliente cliente;
    private boolean disponible;
    public static int codigo_nuevo=999;
    
    public static List<Contrato> contratos = new ArrayList<Contrato>();
    
    public Contrato(int codigo,Date fecha,Long valor,Inmueble inmueble,Cliente cliente, boolean disponible){
        this.codigo=codigo;
        this.fecha=fecha;
        this.valor=valor;
        this.inmueble=inmueble;
        this.cliente=cliente;
        this.setDisponible(disponible);
        
    }
    /*@Override
    public String toString() {
        return "Contrato{" + "codigo=" + codigo + ", fecha=" + fecha + ", valor=" + valor + ", inmueble=" + inmueble + ", disponible=" + disponible + '}';
    }*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Cliente getCliente() {
		return cliente;
	}
	
    public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
