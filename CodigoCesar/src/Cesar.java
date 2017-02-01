
//escribir un metodo en java que implemente en el descifrado cesar es un tipo de cifrado en el que una 
//letra en estado original es reemplazada por otra letra que se encuentra en otra posicion un numero 
//determinacion de espacios en el alfabeto


//Adaptar el programa y que incorporeis un metodo con esta cabecera  public char traduceCharCesar(Char c )

public class Cesar {

//	public void mostrarCodChars(String cadena){//recorrer una cadena 
//		
//		int longi=cadena.length();
//		int numero_carac=0;
//		char caracter=0;
//	     for (int pos=0; pos<longi; pos++){
//	    	 caracter=cadena.charAt(pos);
//	    	 numero_carac=(int)caracter;
//	    	 
//	    	 System.out.println(caracter +"="+ numero_carac);
//	     }
	     
//	 
	
	public static String codificar(String palabra, int clave){
	
	 int longi = palabra.length();
	 char caracter_Actual=0;
	 String palabra_cifrada=null;	 
		 
	 palabra_cifrada=new String();
	 
		 
	 for (int pos=0;pos<longi;pos++){
			 caracter_Actual=palabra.charAt(pos);
			 palabra_cifrada = palabra_cifrada + traduceCharCesar(caracter_Actual,clave);
	 }
		 
	 return palabra_cifrada;
	 
	 }
	 
	 public static  char traduceCharCesar(char c, int clave2){
		 
		 char capturarChar=0;
		 int capturarLetra=0;
		
		 int numero_Carac=0;
		
		
		 if (c != ' '){
		    
		     capturarLetra=(int)c;
			 capturarLetra= capturarLetra+clave2;
			 
			 capturarChar=(char)capturarLetra;
			   
		  
			 
     }
	 	 
	 
 
		
		return capturarChar;
		
		 
	 }

		
	
	public static void main(String[] args) {
//			
//			Cesar cesar=null;
//			cesar=new Cesar();
//			cesar.mostrarCodChars("LOLIPOP");
//			
//			int j=81;
//			char c=(char)j;
//			System.out.println(c);
		

		
		Cesar cesar=null;
		cesar= new Cesar();
		
		
		System.out.println(	cesar.codificar("V ALERIANO",3));
		
	}
}
