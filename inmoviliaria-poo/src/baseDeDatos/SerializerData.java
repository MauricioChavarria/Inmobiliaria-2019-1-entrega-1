package baseDeDatos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import gestorAplicacion.paqueteServicios.*;
import gestorAplicacion.paqueteUsuarios.*;


public class SerializerData {

	/**
	 * @param args
	 */
	static LinkedList<Object> objetos = new LinkedList<Object>();
	static String nombreArchivo = System.getProperty("user.dir")+"/src/temp/dataSerialized";

	
	public SerializerData() {
		try{
			serializeDataIn();
			Administrador.admins = (List<Administrador>) this.objetos.get(0);
		}catch(ClassNotFoundException | IOException e){
			System.out.println("No se puedo inicializar el programa");
		}
	}
	
	private static void serializeDataOut()throws IOException{
	    FileOutputStream fos = new FileOutputStream(nombreArchivo);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(objetos);
	    oos.close();
	}

	public static void serializeDataIn() throws IOException, ClassNotFoundException{

	   FileInputStream fin = new FileInputStream(nombreArchivo);
	   ObjectInputStream ois = new ObjectInputStream(fin);
	   objetos = (LinkedList)ois.readObject();
	   ois.close();
	}

	public void finalize() {
		objetos.push(Administrador.admins);
		objetos.push(Cliente.clientes);
		objetos.push(Funcionario.funcionarios);
		objetos.push(Inmueble.inmuebles);
		objetos.push(Arriendo.arriendos);
		objetos.push(Compraventa.compraventas);
		objetos.push(Contrato.contratos);
		try{
			serializeDataOut();
		}catch(IOException e){
			System.out.println("Error al guardar datos");
		}
	}

}
