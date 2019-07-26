package gestorAplicacion.paqueteServicios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gestorAplicacion.paqueteServicios.Inmueble;

public class Arriendo extends Contrato implements Serializable{
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Date fechafin;
  public static List<Arriendo> arriendos = new ArrayList<Arriendo>();
  
  public Arriendo(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago, Date fechafin) {
      super(codigo,fecha,valor,inmueble,disponible);
      this.fechafin = fechafin;
      
      arriendos.add(this);
  }

  @Override
  public String toString() {
      return "Arriendo{" + ", fechafin=" + fechafin + '}';
  }

  public Date getFechafin() {
      return fechafin;
  }

  public void setFechafin(Date fechafin) {
      this.fechafin = fechafin;
  }
}