package gestorAplicacion.paqueteUsuarios;

//import gestorAplicacion.paqueteServicios.Inmueble;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import gestorAplicacion.paqueteServicios.Contrato;
import gestorAplicacion.paqueteServicios.Inmueble;

public class Cliente extends Usuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static List<Cliente> clientes = new ArrayList<Cliente>();
    public Cliente(int cedula, String nombre, String correo, String contrasena, String direccion) {
         super(cedula,nombre,correo,contrasena,direccion);
         
         clientes.add(this);
    }
    
    public static void eliminarInmueble(int codigo){
		int i=0;
		for(Inmueble inmueble: Inmueble.inmuebles) {
			
			if(inmueble.getcodigo_Inmueble()==codigo) {
				Funcionario.funcionarios.remove(i);
				System.out.println("Inmueble eliminado");
				return;
			}
			i++;
		}
		System.out.println("Este inmueble no existe");
	}
    
    public static Cliente getCliente(int cc,List<Cliente> clientes) {
        return clientes.get(cc);
    }
    public static Cliente login(int cedula, String contrasena, ArrayList<Cliente> clientes) {
        
         for(Cliente c: clientes){
             if(c.getCedula()== cedula && c.getContrasena().equals(contrasena)){
                 return c;
             }
         }
        return null;
    }
}