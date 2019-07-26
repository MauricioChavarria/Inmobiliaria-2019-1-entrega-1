package gestorAplicacion.paqueteServicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private int codigo;
    private Date fecha;
    private double valor;
    private Inmueble inmueble;
    private boolean disponible;
    public static int codigo_nuevo=999;
    
    public static List<Contrato> contratos = new ArrayList<Contrato>();
    
    public Contrato(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible){
        this.codigo=codigo;
        this.fecha=fecha;
        this.inmueble =inmueble;
        this.valor=valor;
        this.disponible=disponible;
        
        contratos.add(this);
    }
    @Override
    public String toString() {
        return "Contrato{" + "codigo=" + codigo + ", fecha=" + fecha + ", valor=" + valor + ", inmueble=" + inmueble + ", disponible=" + disponible + '}';
    }

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

    public double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
