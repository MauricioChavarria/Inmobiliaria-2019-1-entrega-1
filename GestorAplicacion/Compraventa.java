package GestorAplicacion;
import java.util.Date;
import java.util.Iterator;
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
    
    public static LinkedList<Inmueble> verInmueblesDisponibles(LinkedList<Inmueble> todos_inmuebles) {
        Iterator<Inmueble> i;
        Inmueble actual;
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
        i = todos_inmuebles.listIterator();
        while (i.hasNext()) {
            actual = i.next();
            if (actual.getDisponible() == true && actual.getEstado() == "enCompraventa") {
                inmuebles_encontrados.add(actual);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }
}
