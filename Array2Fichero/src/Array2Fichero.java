import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;


public class Array2Fichero {

	 public static String[] fromFichero2Array (File file) throws IOException{
		 //Declaramos variables a usar
		 String [] lista_cadena= new String [6];
		 int i=0;
		 String texto= null;
		 //Creamos el objeto del fichero el cual vamos a usar
		 FileReader file1 = new FileReader(file);	 
		 //Creamos el buffered que sera la forma de leer el fichero
		 BufferedReader br= new BufferedReader(file1);
		 //leemos mediante el objeto br de tipo buffered el archivo 
		 texto=br.readLine();
	     //Creamos un While para que cuando no sea null (Vacio) te imprima linea a linea el archivo.
		 while(texto!=null){
		 //metemos en el array la linea leida en la posicion i.
		 lista_cadena[i]= texto;
		 System.out.println(lista_cadena[i]);
		 //lo leemos otra vez dentro del bucle para que pase de linea.
		 texto=br.readLine();
     	 i++;
         
	}	 
		 br.close();	 
		 file1.close();
  
		 
		 
		 return lista_cadena;
	 }
	 public static  boolean fromArray2Fichero(String [] lista_cadena) throws IOException{
		 boolean ok = false;
		 File fichero = new File("pepe");
		 fichero.createNewFile();
		 
		 FileWriter fichero2= new FileWriter(fichero);
		 BufferedWriter ingresar= new BufferedWriter(fichero2);
		 
		 int i=0;
		 int cadena=lista_cadena.length;
		 String texto=null;
		 
		 while(i<cadena){
			 texto=lista_cadena[i];
			 ingresar.write(texto);
			 
			 ingresar.newLine();
			 System.out.println(texto);
			 i++;
			 
			 if(lista_cadena[5]!=null){
				ok=true;  
		 }
	}
		 
		
		fichero2.close();
		ingresar.close();
		
			
		 
		 
		 
		 
		 return ok;
		 
	 }
	public static void main(String[] args) throws IOException {
		File file3 = new File("hola");
		fromFichero2Array(file3);
		
		String [] array= new String [7];
		
		array=fromFichero2Array(file3);
		
		if(fromArray2Fichero(array)){
			System.out.println("se creo la copia");
		}
		else{
			System.out.println("no se creo");
		}
	}

}
