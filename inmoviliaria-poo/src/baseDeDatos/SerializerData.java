package baseDeDatos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import gestorAplicacion.paqueteServicios.*;
import gestorAplicacion.paqueteUsuarios.*;


public class SerializerData {

	/**
	 * @param args
	 */
	static LinkedList<Object> objetos = new LinkedList<Object>();
	static String nombreArchivo = System.getProperty("user.dir");

	private static Path path = Paths.get(nombreArchivo, "src", "temp", "dataSerialized");

	
	
	public SerializerData() throws IOException {

		System.out.println(path);
		try{
			serializeDataIn();
		//	if(objetos.size() > 2) {
			   Administrador.admins = (List<Administrador>) objetos.get(0);
//			   Cliente.clientes = (List<Cliente>) objetos.get(1);
//			   Funcionario.funcionarios = (List<Funcionario>) objetos.get(2);
			   //Inmueble.inmuebles = (List<Inmueble>) objetos.get(3);
			   //Arriendo.arriendos = (List<Arriendo>) objetos.get(4);
			   //Compraventa.compraventas = (List<Compraventa>) objetos.get(5);
			   //Contrato.contratos = (List<Contrato>) objetos.get(6);
		//	}
		}catch(ClassNotFoundException e){
			System.out.println("Clase no encontrada");
		}catch(IOException e){
			System.out.println("Archivo no encontrado");
			try {
				serializeDataOut();
			}catch(IOException ee) {
				System.err.print(ee);
			}
			
		}
	}
	
	private static void serializeDataOut()throws IOException{
	    FileOutputStream fos = new FileOutputStream(path.toString());
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(objetos);
	    oos.close();
	}

	public static void serializeDataIn() throws IOException, ClassNotFoundException{

	   FileInputStream fin = new FileInputStream(path.toString());
	   ObjectInputStream ois = new ObjectInputStream(fin);
	   objetos = (LinkedList)ois.readObject();
	   
	   System.out.println("Llegue sin ganas ");
	   ois.close();
	}

	public void finalize() {
		objetos.push(Administrador.admins);
//		objetos.push(Cliente.clientes);
//		objetos.push(Funcionario.funcionarios);
		//objetos.push(Inmueble.inmuebles);
		//objetos.push(Arriendo.arriendos);
		//objetos.push(Compraventa.compraventas);
		//objetos.push(Contrato.contratos);
		try{
			serializeDataOut();
		}catch(IOException e){
			System.out.println("Error al guardar datos \n" + e);
		}
	}

}
