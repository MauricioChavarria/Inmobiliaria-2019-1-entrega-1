package gestorAplicacion.funcionesAplicacion;

import gestorAplicacion.paqueteUsuarios.Administrador;
import uiMain.MenuDeConsola;
import uiMain.OpcionDeMenu;
import uiMain.OpcionDeMenuFuncion;

/**
 * FuncionAdministrador
 */
public class FuncionAdministrador extends Administrador implements OpcionDeMenu{

    MenuDeConsola menu ;

    public FuncionAdministrador(int cedula, String nombre, String correo, String contrasena, String direccion) {
        super(cedula, nombre, correo, contrasena, direccion);
    }
    
}