package gestorAplicacion.paqueteServicios;

import java.util.Date;
import gestorAplicacion.paqueteServicios.Contrato;
import gestorAplicacion.paqueteServicios.Inmueble;

public class Arriendo extends Contrato{
  
  private Date fechafin;
  
  public Arriendo(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago, Date fechafin) {
      super(codigo,fecha,valor,inmueble,disponible);
      this.fechafin = fechafin;
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