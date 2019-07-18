package GestorAplicacion;
import java.util.LinkedList;
import java.util.Iterator;
//import java.util.List;

public class Inmueble {
    
    private int estrato;
    private String direccion;
    private boolean vigilancia;
    private boolean ascensor;
    private int area;
    private int cuartos;
    private int banos;
    private String tipo;
    private Compraventa compraventa;
    private LinkedList<Arriendo> arriendo;
    private int antiguedad;
    private String ciudad;
    private boolean estado;

    public Inmueble(int estrato, String direccion, boolean vigilancia, boolean ascensor, int area, int cuartos, int banos, String tipo, Compraventa compraventa, Arriendo arriendo, int antiguedad, String ciudad, boolean estado) {
        this.estrato = estrato;
        this.direccion = direccion;
        this.vigilancia = vigilancia;
        this.ascensor = ascensor;
        this.area = area;
        this.cuartos = cuartos;
        this.banos = banos;
        this.tipo = tipo;
        this.compraventa = compraventa;
        this.arriendo = new LinkedList<Arriendo>();
        this.antiguedad = antiguedad;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    /*@Override
    public String toString() {
        return "Inmueble{" + "estrato=" + estrato + ", vigilancia=" + vigilancia + ", ascensor=" + ascensor + ", area=" + area + ", banos=" + banos + ", cuartos=" + cuartos + ", tipo=" + tipo + ", arriendo=" + arriendo + ", compraventa=" + compraventa + ", propietario=" + propietario + ", ciudad=" + ciudad + ", antiguedad=" + antiguedad + ", disponible=" + disponible + '}';
    }*/
    
    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion.trim();
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
    
    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }
    
    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.trim();
    }

    public Compraventa getCompraventa() {
        return compraventa;
    }

    public void setCompraventa(Compraventa compraventa) {
        this.compraventa = compraventa;
    }
    
    public LinkedList<Arriendo> getArriendo() {
        return arriendo;
    }

    public void setArriendo(LinkedList<Arriendo> arriendo) {
        this.arriendo = arriendo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.trim();
    }

    
    public boolean getEstado() {
        return estado;
    }

    public void setDisponible(boolean estado) {
        this.estado = estado;
    }
//Metodos-------------------------------------------------------------------------------------------
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
//Busquedas----------------
//Arriendos Disponibles
    public static LinkedList<Inmueble> buscarInmueblesEnArriendos(LinkedList<Inmueble> todos_inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
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
//inmuebles en venta
    public static LinkedList<Inmueble> buscarInmueblesEnVenta(LinkedList<Inmueble> todos_inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
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
//Todos los inmuebles    
    public static LinkedList<Inmueble> verInmuebles(LinkedList<Inmueble> todos_inmuebles) {
        Iterator<Inmueble> i;
        Inmueble actual;
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
        i = todos_inmuebles.listIterator();
        while (i.hasNext()) {
            actual = i.next();
            if (actual.getEstado() == true) {
                inmuebles_encontrados.add(actual);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }
//por Estrato
    public static LinkedList<Inmueble> buscarPorEstrato(LinkedList<Inmueble> todos_inmuebles, int estrato) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
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
//por Baños
    public static LinkedList<Inmueble> buscarPorNumeroDeBanos(LinkedList<Inmueble> todos_inmuebles, int banosini, int banostop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
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
//por Cuartos
    public static LinkedList<Inmueble> buscarPorNumeroDeCuartos(LinkedList<Inmueble> todos_inmuebles, int cuartosini, int cuartostop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<>();
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
//por Area
    public static LinkedList<Inmueble> buscarPorArea(LinkedList<Inmueble> todos_inmuebles, int areaini, int areatop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        int area;
        for (Inmueble iterado : todos_inmuebles) {
            area = iterado.getArea();

            if ((area <= areatop) && (area >= areaini)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;

    }
}
