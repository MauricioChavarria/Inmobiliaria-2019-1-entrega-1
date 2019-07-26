package gestorAplicacion.paqueteServicios;

import java.util.Date;
import gestorAplicacion.paqueteUsuarios.Cliente;
import gestorAplicacion.paqueteServicios.Contrato;
import gestorAplicacion.paqueteServicios.Inmueble;

public class Compraventa extends Contrato {

  private Cliente comprador;
  private String medioPago;
  
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

}