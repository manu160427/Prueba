import java.util.Scanner;


public class PedirNotas {
	 
	
	public static int pedirNota(){
		   int numero = 0;
		   Scanner sc = null;
		   
		   sc = new Scanner(System.in);
		   numero = sc.nextInt();
		   
		   return numero;
		   }
	
	// calcular si es verdadero o falso el num par
	
	/*public static boolean esPar (int num){
		boolean bul=false;
		if (num%2==0){
			bul=true;
		}
		else 
		{
			bul=false;
		}
		return bul;
		
	}*/
	
	//calcular si la nota es verdadera o falsa
	
	
	public static void main(String[] args) {
		
		int nota_Introducida=0;
		//int contador=0;
		//int n_Pares_Aparecidos=0;
		//int n_Pares_quiere=0;
		
		do{
			System.out.println("Dame nota");
			nota_Introducida = pedirNota();
			
			if (nota_Introducida<5){
			System.out.println("palmaste");
			}
			
			
		} while (nota_Introducida > 5);{
			
			System.out.println("aprobaste. enhorabuena");
		}
		
	
		//while (n_Pares_Aparecidos < n_Pares_quiere){
			
			//if (esPar(contador)){
				//System.out.println(contador);
				//n_Pares_Aparecidos++;
			//}
			//contador++;
		}
		
		}
		

	


