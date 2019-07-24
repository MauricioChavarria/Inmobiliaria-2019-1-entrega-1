package uiMain;

import java.io.IOException;

import gestorAplicacion.Usuario;
import baseDeDatos.*;

class Main {
	
	public static void main(String[] args) {
		
		//Obtener data y cargar
		
		SerializerData data = new SerializerData();

		try{
			data.serializeDataIn();
		}catch(IOException e){
			try{
				data.serializeDataOut();
			}catch(IOException e){

			}
		}


	}

}
