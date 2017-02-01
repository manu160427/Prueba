import java.util.Scanner;


public class NumeroMayorConFor {
	
	
	
	
  /* public static int pedirNumero(){
	   int numero = 0;
	   Scanner sc = null;
	   
	   sc = new Scanner(System.in);
	   numero = sc.nextInt();
	   
	   return numero;
	   
   }*/
	public static int pedirNumero(){
		   int numero = 0;
		   Scanner sc = null;
		   
		   sc = new Scanner(System.in);
		   numero = sc.nextInt();
		   
		   return numero;
		   }
	public static void main(String[] args) {
		/*int numeroLeido = 0;
		//int mayor = 0;
		
		for(int i=0; i<=10;i++){
			 
			numeroLeido = pedirNumero();
			 System.out.println("el numero leido es"+numeroLeido);
		}*/
		
		
		int numLeido=0;
		int numero_mayor=0;
		
		for (int j=1; j<=10;j++){
			
			System.out.println("introduzca el numero"+j);
			numLeido = pedirNumero();
			
			if(numLeido > numero_mayor){
				numero_mayor= numLeido;
			}
		}
		System.out.println("he terminado");
		System.out.println("numero mayor es: "+numero_mayor);
	  

}
}