package gestorAplicacion.paqueteServicios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inmueble implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo_Inmueble;
	private int predial;
    private int estrato;
    private boolean vigilancia;
    private boolean ascensor;
    private int area;
    private int banos;
    private int cuartos;
    private String tipo;
    private LinkedList<Arriendo> arriendo;
    private Compraventa compraventa;
    private String ciudad;
    private int antiguedad;
    private boolean disponible;
    
    public static List<Inmueble> inmuebles = new ArrayList<Inmueble>();

    public Inmueble(int codigo_Inmueble,int predial, int estrato, boolean vigilancia, boolean ascensor, int area, int banos, int cuartos, String tipo, Compraventa compraventa, String ciudad, int antiguedad, boolean disponible) {
        this.codigo_Inmueble=codigo_Inmueble;
    	this.predial = predial;
        this.estrato = estrato;
        this.vigilancia = vigilancia;
        this.ascensor = ascensor;
        this.area = area;
        this.banos = banos;
        this.cuartos = cuartos;
        this.tipo = tipo;
        this.arriendo = new LinkedList<Arriendo>();
        this.compraventa = compraventa;
        this.ciudad = ciudad;
        this.antiguedad = antiguedad;
        this.disponible = disponible;
        
        inmuebles.add(this);
    }

    @Override
    public String toString() {
        return "Inmueble{"+"codigo Inmueble ="+ codigo_Inmueble + ", estrato=" + estrato + ", vigilancia=" + vigilancia + ", ascensor=" + ascensor + ", area=" + area + ", banos=" + banos + ", cuartos=" + cuartos + ", tipo=" + tipo + ", arriendo=" + arriendo + ", compraventa=" + compraventa + ", ciudad=" + ciudad + ", antiguedad=" + antiguedad + ", disponible=" + disponible + '}';
    }
    
    public int getcodigo_Inmueble() {
    	return codigo_Inmueble;
    }
    
    public void setcodigo_Inmueble(int codigo_Inmueble ) {
    	this.codigo_Inmueble = codigo_Inmueble;
    }

    public int getPredial() {
        return predial;
    }

    public void setPredial(Integer predial) {
        this.predial = predial;
    }
    
    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public boolean getVigilancia() {
        return vigilancia;
    }

    public void setVigilancia(boolean vigilancia) {
        this.vigilancia = vigilancia;
    }

    public boolean getAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.trim();
    }

    public LinkedList<Arriendo> getArriendo() {
        return arriendo;
    }

    public void setArriendo(LinkedList<Arriendo> arriendo) {
        this.arriendo = arriendo;
    }

    public Compraventa getCompraventa() {
        return compraventa;
    }

    public void setCompraventa(Compraventa compraventa) {
        this.compraventa = compraventa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.trim();
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean addArriendo(Arriendo a1) {
        if (this.getCompraventa() == null) {
            this.getArriendo().add(a1);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCompraventa(Compraventa c1) {
        if (this.getCompraventa() == null) {
            this.setCompraventa(c1);
            return true;
        } else {
            return false;
        }
    }

    public static void buscarInmueblesEnVenta_o_EnArriendo(String tipo) {
    	int i=0;
        for (Inmueble iterado : Inmueble.inmuebles) {
            if (iterado.getTipo().equalsIgnoreCase("enVenta")) {
            	Inmueble.inmuebles.get(i);
                System.out.println("Inmuebles en venta");
                return;
            }else if(iterado.getTipo().equalsIgnoreCase("enArriendo")) {
            	Inmueble.inmuebles.get(i);
                System.out.println("Inmuebles en arriendo");
                return;
            }
            i++;
        }
        System.out.println("No se encontraron inmuebles");
    }
}
