package gestorAplicacion;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

    
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    public Cliente(int cedula, String nombre, String correo, String contrasena, String direccion) {
         super(cedula,nombre,correo,contrasena,direccion);
    }
    
    public static void addCliente(Cliente p){
        clientes.add(p);
    }
    public static Cliente getCliente(int cc,List<Cliente> clientes) {
        return clientes.get(cc);
    }
    public static Cliente login(int cedula, String contrasena, ArrayList<Cliente> clientes) {
        
         for(Cliente c: clientes){
             if(c.getCedula()== cedula && c.getContrasena()==contrasena){
                 return c;
             }
         }
        return null;

    }
}

