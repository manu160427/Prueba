import java.util.Scanner;


public class CodiYDeco {
	
  public static String codificar(String texto, String clave){
	  //declaramos variable a usar
	  int longi=texto.length();
	  int longi2=clave.length();
	  int posicion=0;
	  int suma=0;
	  String textoEncriptado="";
	  //nos declaramos dos Arrays 
	  
	  int textoText[]= new int [longi];
	  int textoClave[]= new int [longi2];
	  
	  for(int i=0 ; i<longi; i++){
		  textoText[i]=(int)(texto.charAt(i));
	  }
	  
      for(int i=0; i<longi2; i++){
			  textoClave[i]=(int)(clave.charAt(i));
		  }
      
      for(int i=0; i<longi; i++){
    	  posicion++;
    	  
    	   if(posicion>=longi2){
    	      posicion=0;
    	      
    	      suma= textoText[i] + textoClave[i];
    	      
    	      if(suma>255){
    	      suma=suma-255;
    	      textoEncriptado= textoEncriptado + (char)suma;
    	      }
    	   }
      }
	  
	
	  return textoEncriptado;
	  
	   
}
  public static String decodificar(String texto, String clave){
	  //declaramos variable a usar
	  int longi=texto.length();
	  int longi2=clave.length();
	  int posicion=0;
	  int suma=0;
	  String textoEncriptado="";
	  //nos declaramos dos Arrays 
	  
	  int textoText[]= new int [longi];
	  int textoClave[]= new int [longi2];
	  
	  for(int i=0 ; i<longi; i++){
		  textoText[i]=(int)(texto.charAt(i));
	  }
	  
      for(int i=0; i<longi2; i++){
			  textoClave[i]=(int)(clave.charAt(i));
		  }
      
      for(int i=0; i<longi; i++){
    	  posicion++;
    	  
    	   if(posicion>=longi2){
    	      posicion=0;
    	      
    	      suma= textoText[i] - textoClave[i];
    	      if(suma>255){
    	      suma=suma+256;
    	      textoEncriptado= textoEncriptado + (char)suma;
    	      }
    	   }
    	   
    		  
    		  
      }  
      return textoEncriptado;
  } 
  
  
  
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
	
	   
		System.out.println("dime el texto a encriptar ");
	    String texto = sc.nextLine();
	    System.out.println("ingresa la clave");
	    String clave = sc.nextLine();
	    
		String texto_codificado=codificar(texto,clave);
		System.out.println("el texto codificado es "+texto_codificado);
		
		
	}

}
