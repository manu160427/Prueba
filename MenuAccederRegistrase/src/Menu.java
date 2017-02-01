import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Menu {
	public static void registarse(String nombre, String contraseña) throws IOException{
	//llamamos a los Ficheros ya creados en eclipse por mi 	
		File file = new File("usuario");
		File file1=new File("contraseña");
		
	   
	 //escribimos el fichero file y nos creamos un buffer para poder escribir
		FileWriter fichero= new FileWriter(file);
		BufferedWriter introducir= new BufferedWriter(fichero);
		
		
		//escribimos el fichero file1 y nos creamos un buffer para poder escribir
		FileWriter fichero1= new FileWriter(file1);
		BufferedWriter introducir1= new BufferedWriter(fichero1);
		
		//llamamos al metodo write y escribir lo que hemos recibido del main, (nombre,contraseña) creamos una linea que en este caso no sirve 
		introducir.write(nombre);
		introducir.newLine();
		introducir1.write(contraseña);
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
	
	
	
	
	public static void acceder(String nombre, String contraseña) throws IOException{
		
		File file = new File("usuario");
		File file1 = new File("contraseña");
		
		FileReader fichero= new FileReader(file);
		BufferedReader leer= new BufferedReader(fichero);
		
		FileReader fichero1= new FileReader(file1);
		BufferedReader leer1= new BufferedReader(fichero1);
		
		String nombre1=leer.readLine();
		String contraseña1= leer1.readLine();
		
		
		System.out.println(nombre1+"  el nombre y la contraseña son  "+contraseña1);
		
		//comparamos con el metodo equals de la clase String dado que recibimos dos objetos(nombre y contraseña) como estan en una direccion se compara con equals 
		if(nombre1.equals(nombre) && contraseña1.equals(contraseña)){
			System.out.println("contraseña y nombre son iguales");
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
        String contraseña=null;
		int seleccion= -1;
		
	
		
	    while(seleccion!=0){
	    	
	    	//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opción:\n1.- Registrarse" +
						"\n2.- Acceder\n"+
						"0.- Salir");
				//Recoger una variable por consola
				seleccion = Integer.parseInt(sc.nextLine()); 
				
				if(seleccion==1){
					System.out.println("introduce un nombre");
					nombre=sc.nextLine();
					
					System.out.println("introduce una contraseña");
					   contraseña=sc.nextLine();
					   registarse(nombre,contraseña);
				}
				else if(seleccion==2){
					
					System.out.println("introduce un nombre");
					nombre=sc.nextLine();
					
					System.out.println("introduce una contraseña");
					   contraseña=sc.nextLine();
					   
					  
				       acceder(nombre,contraseña);
				}
			
			}
			catch(Exception e){
				System.out.println("ha ocurrido un error");
				e.printStackTrace();
				
			}
	    }
		
	}

	    
	

}
