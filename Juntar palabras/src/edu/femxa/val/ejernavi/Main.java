package edu.femxa.val.ejernavi;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * INSERTAR DOS PERSONAS
		 * Y BUSCAR UNA Y SI EXISTE, MOSTRARLA, 
		 * USANDO LOS M�TODOS DE LAS CLASES LISTAPERSONAS Y PERSONA
		 */
		
		boolean existe=false;
		String persona;
		
		ListaPersonas lista=null;
		lista = new ListaPersonas();
		
		
		Persona p1=null;
		Persona p2=null;
		
		p1 = new Persona("Valen", 23);
		p2= new Persona ("crstian", 24);
		
		
		
		lista.insertarPersona(p1);
		lista.insertarPersona(p2);
		
		lista.listarPersonas();
		
		if(!existe){
			
			
			
		}
		
	
		
		
		
		
	}

}
