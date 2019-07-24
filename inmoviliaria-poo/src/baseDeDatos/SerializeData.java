package baseDeDatos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import gestorAplicacion.*;


public class SerializeData {

	/**
	 * @param args
	 */
	LinkedList<Object> objetos = new LinkedList<Object>();
	static String nombreArchivo = System.getProperty("user.dir")+"/src/tmp/dataSerialized";

	
	public SerializeData(){
		Boolean emptyAdministrador = true;
		Boolean emptyCliente = true;
		Boolean emptyFuncionario = true;
		Boolean emptyInmueble = true;
		Boolean emptyArriendo = true;
		Boolean emptyCompraventa = true;
		Boolean emptyContrato = true;
		


		if(!Administrador.admins.isEmpty()){
			objetos.push(Administrador.admins);
		}else emptyAdministrador = false;

		if(!Cliente.clientes.isEmpty()){
			objetos.push(Cliente.clientes);
		}else emptyFuncionario = false;

		if(!Funcionario.funcionarios.isEmpty()){
			objetos.push(Funcionario.funcionarios);
		}else emptyFuncionario = false;
		
		if(!Inmueble.inmuebles.isEmpty()){
			objetos.push(Inmueble.inmuebles);
		}else emptyInmueble = false;
		
		if(!Arriendo.arriendos.isEmpty()){
			objetos.push(Arriendo.arriendos);
		}else emptyArriendo = false;
		
		if(!Compraventa.compraventas.isEmpty()){
			objetos.push(Compraventa.compraventas);
		}else emptyCompraventa = false;
		
		if(!Contrato.contratos.isEmpty()){
			objetos.push(Contrato.contratos);
		}else emptyContrato = false;
		
		
	}
	
	public static void serializeDataOut(Object objetos)throws IOException{
	    FileOutputStream fos = new FileOutputStream(nombreArchivo);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(objetos);
	    oos.close();
	}

	public static LinkedList serializeDataIn() throws IOException, ClassNotFoundException{

	   FileInputStream fin = new FileInputStream(nombreArchivo);
	   ObjectInputStream ois = new ObjectInputStream(fin);
	   LinkedList<Object> objetos = (LinkedList)ois.readObject();
	   ois.close();
	   return objetos;
	}

}
