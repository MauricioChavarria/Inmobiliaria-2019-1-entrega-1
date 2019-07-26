package gestorAplicacion.paqueteServicios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gestorAplicacion.paqueteUsuarios.Cliente;
import gestorAplicacion.paqueteServicios.Contrato;
import gestorAplicacion.paqueteServicios.Inmueble;

public class Compraventa extends Contrato implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Cliente comprador;
  private String medioPago;
  public static List<Compraventa> compraventas = new ArrayList<Compraventa>();
  
  public Compraventa(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago) {
      super(codigo,fecha,valor,inmueble,disponible);
      this.comprador = null;
      this.medioPago = medioPago;
      
      compraventas.add(this);
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

}