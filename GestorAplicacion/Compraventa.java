package GestorAplicacion;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Compraventa extends Contrato {
	
    private String medioPago;

    public Compraventa(int codigo, Date fecha, Long valor, Inmueble inmueble, Cliente cliente,boolean disponible, String medioPago) {
        super(codigo, fecha, valor, inmueble, cliente, disponible);
        this.medioPago = medioPago;
    }

    /*@Override
    public String toString() {
        return "Compraventa{" + "comprador=" + comprador + ", medioPago=" + medioPago + '}';
    }*/


    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago.trim();
    }

    public static LinkedList<Compraventa> compraventasDisponibles(HashMap<Integer, Compraventa> compraventas) {
        LinkedList<Compraventa> disponibles = new LinkedList<>();
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
