import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		/**
		 * INSERTAR DOS PERSONAS
		 * Y BUSCAR UNA Y SI EXISTE, MOSTRARLA, 
		 * USANDO LOS M�TODOS DE LAS CLASES LISTAPERSONAS Y PERSONA
		 */
		
		ListarPersonas lista=null;
		lista = new ListarPersonas();
		
		
		Personas p1=null;
		Personas p2=null;
		
		p1 = new Personas("Valen", 23);
		p2= new Personas ("cristian", 24);
		
		lista.insertarPersona(p1);
		lista.insertarPersona(p2);
		
		lista.listarPersonas();
		
		int resultado= lista.buscarPersonaPos("cristian");
		
		if(resultado == -5){
			System.out.println("no esta");
			
		}
		else{
			System.out.println("esta "+resultado);
			
			Personas p3=lista.obtenerPersona(resultado);
			
			p3.mostrarPersona();
		}
		
		
		
		
		
		
		
		
		
	}

}


