package gestorAplicacion.paqueteServicios;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import gestorAplicacion.paqueteUsuarios.Cliente;

public class Compraventa extends Contrato {

    private Cliente comprador;
    private String medioPago;
    
    public static List<Compraventa> compraventas = new ArrayList<Compraventa>();

    public Compraventa(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago) {
        super(codigo,fecha,valor,inmueble,disponible);
        this.comprador = null;
        this.medioPago = medioPago;
    }

    @Override
    public String toString() {
        return "Compraventa{" + "comprador=" + comprador + ", medioPago=" + medioPago + '}';
    }
    
    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago.trim();
    }

    public static LinkedList<Compraventa> compraventasDisponibles(HashMap<Integer, Compraventa> compraventas) {
        LinkedList<Compraventa> disponibles = new LinkedList<Compraventa>();
        for (Compraventa c1 : compraventas.values()) {
            if (c1.getDisponible()) {
                disponibles.add(c1);
            }
        }
        if (disponibles.isEmpty()) {
            return null;
        }
        return disponibles;

    }

}
