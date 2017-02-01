import java.util.Scanner;


public class Dni {
	
	    public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	    
	    public static int pedirDni(){
	    	
	    	Scanner leer = new Scanner(System.in); 
	    	int dni = leer.nextInt(); 
			
	    	return dni;
	    	
	    }
	    
			public static void main(String[] args) { 
				int dni;
				
				System.out.println("Introduce DNI sin letra: ");
				dni=pedirDni();
				
				int index = (dni%23);
				System.out.println("Su letra de DNI es: "+ caracteresDNI.charAt(index)); 
				
		}

	}
