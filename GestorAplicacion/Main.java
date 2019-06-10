package GestorAplicacion;
import java.util.*;

public class Main {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Bienvenido a nuestra Inmobiliaria");
        String entrada;
        HashMap<Integer, Propietario> propietarios = new HashMap<Integer, Propietario>();

        //comienza el menu
        String opcion = "0";
        int seleccion;

        ciclo_menu_principal:
        while (true) {

            System.out.println("-------------------------------------------------------\n ** Bienvenido, seleccione una de las siguientes opciones: **\n "
                    + "1. Agregar datos ficticios\n "
                    + "2. Agregar datos ficticios desde TXT (cliente)\n "
                    + "3. Registrar Propietario\n "
                    + "4. Ingreso Propietario\n "
                    + "5. Registrar Cliente\n "
                    + "6. Ingreso Cliente\n "
                    + "0. Salir"
            );
            opcion = in.next();
            switch (opcion) {

                case ("0"):
                    System.out.println("Gracias, hasta luego");
                    break ciclo_menu_principal;

                case ("1"):
                    System.out.println("Agregar datos ficticios");
                    break;

                case ("2"):
                    System.out.println("Agregar datos desde TXT (cliente)");
                    break;

                case ("3"):
                    System.out.println("Registrar Propietario");
                    System.out.println("Ingrese los siguientes datos:");
                    System.out.println("Cedula: ");
                    entrada = in.next();
                    try {
                        seleccion = Integer.parseInt(entrada);

                    } catch (NumberFormatException e) {
                        System.out.println("No es una cedula valida");
                        break;
                    }
                    if(propietarios.containsKey(seleccion)){
                        System.out.println("Ya existe un usuario registrado con esa cedula.");
                        break;
                    }
                    System.out.println("Nombre: ");
                    String nombre = in.next();
                    System.out.println("Correo: ");
                    String correo = in.next();
                    System.out.println("Contrasena: ");
                    String contrasena = in.next();
                    System.out.println("Direccion: ");
                    String direccion = in.next();
                    Propietario p1 = new Propietario(seleccion, nombre, correo, contrasena, direccion);
                    System.out.println(p1);
                    propietarios.put(seleccion, p1);
                    System.out.println("Registrado correctamente");
                    break;

                case ("4"):
                    Propietario logeado;
                    System.out.println("Ingresar Propietario: ");
                    System.out.println("Ingrese su cedula");
                    entrada = in.next();
                    try {
                        seleccion = Integer.parseInt(entrada);

                    } catch (NumberFormatException e) {
                        System.out.println("No es una cedula valida");
                        break;
                    }
                    System.out.println("Ingrese su contrasena");
                    entrada = in.next();
                    logeado = Propietario.login(seleccion,entrada,propietarios);
                    if (logeado != null) {
                        System.out.println("bienvenido: "+logeado.getNombre());
                        
                        while(true){
                            System.out.println("-------------------------------\n Seleccione una de las siguientes opciones: \n"+
                                    "1. Registrar nuevo inmueble.\n"+
                                    "2. Ver listado de inmuebles.\n"+
                                    "3. Aprobar solicitudes de compraventa.\n"+
                                    "4. Aprobar solicitudes de arrendamiento.\n"+
                                    "0. Regresar al menu principal.\n");
                            opcion = in.next();
                            
                        }
                    } else {
                        System.out.println("no se logeo");
                    }
                    break;

                case ("5"):
                    System.out.println("Registrar Cliente");
                    break;

                case ("6"):
                    System.out.println("Ingresar Cliente");
                    break;
            }

        }

    }

}

