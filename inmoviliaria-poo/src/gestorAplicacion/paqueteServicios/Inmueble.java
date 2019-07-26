package gestorAplicacion.paqueteServicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inmueble {
    
    private String codigo_Inmueble;
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

    public Inmueble(String codigo_Inmueble,int predial, int estrato, boolean vigilancia, boolean ascensor, int area, int banos, int cuartos, String tipo, Compraventa compraventa, String ciudad, int antiguedad, boolean disponible) {
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
    }

    @Override
    public String toString() {
        return "Inmueble{"+"codigo Inmueble ="+ codigo_Inmueble + ", estrato=" + estrato + ", vigilancia=" + vigilancia + ", ascensor=" + ascensor + ", area=" + area + ", banos=" + banos + ", cuartos=" + cuartos + ", tipo=" + tipo + ", arriendo=" + arriendo + ", compraventa=" + compraventa + ", ciudad=" + ciudad + ", antiguedad=" + antiguedad + ", disponible=" + disponible + '}';
    }
    
    public String getcodigo_Inmueble() {
    	return codigo_Inmueble;
    }
    
    public void setcodigo_Inmueble(String codigo_Inmueble ) {
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


    public static LinkedList<Inmueble> verInmueblesDisponibles(LinkedList<Inmueble> todos_inmuebles) {
        Iterator<Inmueble> i;
        Inmueble actual;
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        i = todos_inmuebles.listIterator();
        while (i.hasNext()) {
            actual = i.next();
            if (actual.getDisponible()) {
                inmuebles_encontrados.add(actual);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    public static Inmueble buscarPorPredial(List<Inmueble> inmuebles, int predial) {
        for (Inmueble iterado : inmuebles) {
            if (iterado.getPredial() == predial) {
                return iterado;
            }
        }
        return null;
    }

    public static LinkedList<Inmueble> buscarInmueblesEnCompraventa(LinkedList<Inmueble> todos_inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {

            if (iterado.getTipo().equalsIgnoreCase("enVenta")) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    public static LinkedList<Inmueble> buscarInmueblesEnArriendo(LinkedList<Inmueble> todos_inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {

            if (iterado.getTipo().equalsIgnoreCase("enArriendo")) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    ////busquedaaaaaaaas
    //por ciudad
    public static LinkedList<Inmueble> buscarPorCiudad(LinkedList<Inmueble> todos_inmuebles, String ciudad) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {
            if (iterado.getCiudad().equalsIgnoreCase(ciudad)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por estrato
    public static LinkedList<Inmueble> buscarPorEstrato(LinkedList<Inmueble> todos_inmuebles, int estrato) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {
            if (iterado.getEstrato() == estrato) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por numero de banos
    public static LinkedList<Inmueble> buscarPorNumeroDeBanos(LinkedList<Inmueble> todos_inmuebles, int banosini, int banostop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        int bano;
        for (Inmueble iterado : todos_inmuebles) {
            bano = iterado.getBanos();
            if ((bano >= banosini) && (bano <= banostop)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por numero de cuartos
    public static LinkedList<Inmueble> buscarPorNumeroDeCuartos(LinkedList<Inmueble> todos_inmuebles, int cuartosini, int cuartostop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        int c;
        for (Inmueble iterado : todos_inmuebles) {
            c = iterado.getCuartos();

            if ((c <= cuartostop) && (c >= cuartosini)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    

}