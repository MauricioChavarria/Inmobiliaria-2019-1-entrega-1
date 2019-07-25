package gestorAplicacion.paqueteUsuarios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Administrador extends Usuario  {

    public static List<Administrador> admins = new ArrayList<Administrador>();

	public Administrador(int cedula, String nombre, String correo, String contrasena, String direccion) {
		super(cedula, nombre, correo, contrasena, direccion, "admin");
	}
	
	public static LinkedList<Funcionario> listarFuncionarios(LinkedList<Funcionario> todos_funcionarios){
		 LinkedList<Funcionario> funcionarioa_encontrados = new LinkedList<Funcionario>();
	        for (Funcionario iterado : todos_funcionarios) {
	        	funcionarioa_encontrados.add(iterado);
	        }
	        return funcionarioa_encontrados;
	}
	
	public static void addFuncionario(Funcionario f){
		 Funcionario.funcionarios.add(f);
	}
	
	public static Administrador login(int cedula, String contrasena) {
        
        for(Administrador a: admins){
            if(a.getCedula()== cedula && a.getContrasena()==contrasena){
                return a;
            }
        }
    	return null;

	}

}
