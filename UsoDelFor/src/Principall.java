
public class Principall {

	public static void main(String[] args) {
		Persona persona1 = null;//declaro variable y la inicializo.
     	persona1= new Persona("manuel",33);//si tiene memoria ya tiene hueco.
    
     	System.out.println("esta persona se llama  " +persona1.nombre+ " y su edad es: " +persona1.edad);
     	
     	
     	Persona persona2= null;
     	persona2 = new Persona("pepe", 44);
     	
     	System.out.println("esta persona se llama  " +persona2.nombre+ " y su edad es: " +persona2.edad);
     	
	}

}