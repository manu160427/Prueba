import java.util.Scanner;


public class main {
	
	 public static String pedirNombre(){
	    	
 	    String nombre_Pedido = null;
 	    Scanner sc = null;
	   		   
		   sc = new Scanner(System.in);
		   nombre_Pedido = sc.nextLine();
		   
		   return nombre_Pedido;
		   
 }
 
 public static int pedirEdad(){
 	int edad=0;
 	Scanner sc = null;
 
 		sc = new Scanner (System.in);
 		edad= sc.nextInt();
		  
		return edad;
 	
 }
	
	public static final int NUMERO_ALUMNOS=5;

	public static void main(String[] args) {
		
		for ( int i=0; i<=NUMERO_ALUMNOS; i++){
			String nombre = null;
			int edad = 0;

			System.out.println("introduzca el nombre : ");
			nombre = pedirNombre();
			
			System.out.println("Introduzca la edad : ");
			edad = pedirEdad();
			
			Persona p= new Persona (nombre, edad);
			
			p.mostrarPersona();
			
			
			Alumno alumno=new Alumno();
			alumno.setNombre("Nira");
			alumno.setEdad(26);
			
			alumno.mostrarPersona();
			
			
			if (alumno instanceof Persona)
			{
				System.out.println("El alumno es instancia Persona");
			}
			if (alumno instanceof Alumno){
				System.out.println("el alumno es intancia de ALumno");
			}
			if (alumno instanceof Object){
				System.out.println("el alumno es intancia de Object");
				
				
			}
		}
		
		
		
		
		

}
}
