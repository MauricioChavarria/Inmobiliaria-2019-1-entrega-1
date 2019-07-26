package uiMain;

import java.io.IOException;

import gestorAplicacion.paqueteUsuarios.Usuario;
import baseDeDatos.*;

class Main {
	
	public static void main(String[] args)  {
		
		//Obtener data y cargar
		
		SerializerData data = new SerializerData();
		System.out.print("q");
		try{
			data.serializeDataIn();
			
		}catch(IOException | ClassNotFoundException e){
			try{
				data.serializeDataOut();
			}catch(IOException f){
				
			}
		}


	}

}
