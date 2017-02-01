import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Menu {
	public static void registarse(String nombre, String contrase�a) throws IOException{
	//llamamos a los Ficheros ya creados en eclipse por mi 	
		File file = new File("usuario");
		File file1=new File("contrase�a");
		
	   
	 //escribimos el fichero file y nos creamos un buffer para poder escribir
		FileWriter fichero= new FileWriter(file);
		BufferedWriter introducir= new BufferedWriter(fichero);
		
		
		//escribimos el fichero file1 y nos creamos un buffer para poder escribir
		FileWriter fichero1= new FileWriter(file1);
		BufferedWriter introducir1= new BufferedWriter(fichero1);
		
		//llamamos al metodo write y escribir lo que hemos recibido del main, (nombre,contrase�a) creamos una linea que en este caso no sirve 
		introducir.write(nombre);
		introducir.newLine();
		introducir1.write(contrase�a);
		introducir1.newLine();
		
		//si el fichero  tiene algo dira el syso
		if(file!=null){
			System.out.println("registrado correctamente");
			
		}
		//cerramos primero los buffered y luego los ficheros por orden 
		introducir.close();
		introducir1.close();
		
		fichero.close();
		fichero1.close();
		
		
	   	
	}
	
	
	
	
	public static void acceder(String nombre, String contrase�a) throws IOException{
		
		File file = new File("usuario");
		File file1 = new File("contrase�a");
		
		FileReader fichero= new FileReader(file);
		BufferedReader leer= new BufferedReader(fichero);
		
		FileReader fichero1= new FileReader(file1);
		BufferedReader leer1= new BufferedReader(fichero1);
		
		String nombre1=leer.readLine();
		String contrase�a1= leer1.readLine();
		
		
		System.out.println(nombre1+"  el nombre y la contrase�a son  "+contrase�a1);
		
		//comparamos con el metodo equals de la clase String dado que recibimos dos objetos(nombre y contrase�a) como estan en una direccion se compara con equals 
		if(nombre1.equals(nombre) && contrase�a1.equals(contrase�a)){
			System.out.println("contrase�a y nombre son iguales");
		}
		else {
			System.out.println("no son iguales vuelva a intentarlo ");
		}
		
		
		
		//cerramos buffered y archivos 
	    leer.close();
	    leer1.close();
	    fichero.close();
	    fichero1.close();
	    
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String nombre= null;
        String contrase�a=null;
		int seleccion= -1;
		
	
		
	    while(seleccion!=0){
	    	
	    	//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opci�n:\n1.- Registrarse" +
						"\n2.- Acceder\n"+
						"0.- Salir");
				//Recoger una variable por consola
				seleccion = Integer.parseInt(sc.nextLine()); 
				
				if(seleccion==1){
					System.out.println("introduce un nombre");
					nombre=sc.nextLine();
					
					System.out.println("introduce una contrase�a");
					   contrase�a=sc.nextLine();
					   registarse(nombre,contrase�a);
				}
				else if(seleccion==2){
					
					System.out.println("introduce un nombre");
					nombre=sc.nextLine();
					
					System.out.println("introduce una contrase�a");
					   contrase�a=sc.nextLine();
					   
					  
				       acceder(nombre,contrase�a);
				}
			
			}
			catch(Exception e){
				System.out.println("ha ocurrido un error");
				e.printStackTrace();
				
			}
	    }
		
	}

	    
	

}