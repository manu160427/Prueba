
public class MostrarNumeros {
	/*	HACED UN M�TODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON UN BUCLE FOR
		HACED UN M�TODO QUE DADA UNA CADENA Y UN N�MERO N, MUESTRE LOS N PRIMEROS N�MEROS DE LA CADENA
		HACED UN M�TODO QUE DADA UNA CADENA Y UN N�MERO N, MUESTRE LOS N �LTIMOS N�MEROS DE LA CADENA
		HACED UN M�TODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL N�MERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA*/
	
	
	   
	
//	  //primero 
//	
//	    public static void mostrarLetrasP(String palabra){
//	    	int longi=0;
//			longi=palabra.length();
//			
//			for (int i=0; i<longi;i++){
//				
//				System.out.println("la palabra  es "+ palabra.charAt(i));
//			}
//	    	
//	    }
//		public static void main(String[] args) {
//			
//        mostrarLetrasP("Peque�o");
//					
//					
//			
//			
//		}
		
		
	
	
	
	
//	// este es el segundo
//	
//	    String cadena=null;
//		int numero=0;
//	
//		public static void  mostrarNumeros(String cadena, int num){
//			int i=0;
//	        
//			
//	       for( i=0; i<num; i++){
//	    	   
//	    	   System.out.println("la cadena imprime " + cadena.charAt(i));
//	    	   
//	    	   
//	       }
//		 
//		 
//		}
//	
//		public static void main(String[] args) {
//			
//		     mostrarNumeros("Manuel", 3);
//	
//	
//   }
	
	
	
	//este es el tercero
		public static void muestra_N_Numeros(String palabra, int numero){
			
			int lim_Sup= palabra.length()-1;
			int lim_Inf= palabra.length()-numero;
			
			while(lim_Sup>=lim_Sup){
				System.out.println(palabra.charAt(lim_Sup));
				
				lim_Sup --;
			}
	    }
		
		public static void main(String[] args) {
			 muestra3Numeros("manuel",2);
			
}


	
	
	 public static void mostrarLosTresUltimos(String cadena ){
		 int i =0;
		 int numero=cadena.length();
		 
		 for (i=4; i<numero;i++){
			 System.out.println("la cadena introduce los caracteres" + cadena.charAt(i));
			 
		 }
		
		
		
	}
	//este es el que nos ha mandado
		
	 public static void muestra3Numeros(String palabra, int num){
		
		 
	 }
	
	
	
}

