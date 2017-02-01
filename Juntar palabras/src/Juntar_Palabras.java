import java.util.Scanner;


public class Juntar_Palabras{
	

	  public static String pedir_Cadena(){
		  String cadena=null;
		  
		  Scanner sc= null;
		  sc= new Scanner(System.in);
		  
		  cadena=sc.nextLine();
		  
		  return cadena;
		  
	  }
	  public static String borrar_Espacios(String cadena){
		  
		  int primeraCadena=cadena.length();
		  String cadena_Aux="";
		  char caracterCadena=0;
		  String ultimaCadena=null;
		  
		  
		  for( int i=0; i<primeraCadena; i++){
			  caracterCadena= cadena.charAt(i);
			  
			  if(caracterCadena == ' '){
				
			 }
			  else{
				  cadena_Aux=cadena_Aux+caracterCadena;
			  }
			  
		  }
		  
		 
		  
		  
		  return ultimaCadena;
		  
		  
		  
	  }
	public static void main(String[] args) {
		String cadena=null;
		String frase_final=null;
		
		
		System.out.println("Introduzca una frase");
		cadena=pedir_Cadena();
		
		frase_final=borrar_Espacios(cadena);
		System.out.println("la frase final es " +frase_final);
		


	}

}
