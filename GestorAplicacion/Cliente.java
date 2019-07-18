package GestorAplicacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente extends Usuario{

    private Contrato contratos;
    
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    
    public Cliente(Long cedula, String nombre, String correo, String contrasena, String direccion, Contrato contratos) {
    	super(cedula, nombre, correo, contrasena, direccion);
        this.contratos=contratos;
        
    }
    
    public Contrato getContratos() {
		return contratos;
	}
	
    public void setContratos(Contrato contratos) {
		this.contratos = contratos;
	}

    public static LinkedList<Inmueble> verInmueble(LinkedList<Inmueble> todos_inmuebles){
		return Inmueble.verInmuebles(todos_inmuebles);
	}
	
}
