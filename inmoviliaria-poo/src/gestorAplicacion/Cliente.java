package gestorAplicacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente extends Usuario{

    
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    
    public Cliente(Long cedula, String nombre, String correo, String contrasena, String direccion, Contrato contratos) {
    	super(cedula, nombre, correo, contrasena, direccion);
        
    }
    
    public static LinkedList<Inmueble> verInmueble(LinkedList<Inmueble> todos_inmuebles){
		return Inmueble.verInmueblesDisponibles(todos_inmuebles);
	}
	
}
