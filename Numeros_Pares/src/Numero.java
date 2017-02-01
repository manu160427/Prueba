import java.util.Scanner;


public class Numero {
	 
	public static void main(String[] args) {
		    int numero_Usuario=0;
            int resto=0;
            int num_Pares=0;
            
            Scanner scanner= null;
            System.out.println("cuantos numeros pares quieres");
            scanner = new Scanner(System.in);
            numero_Usuario=scanner.nextInt();
		  
            for(int i = 0; num_Pares<=100; i++){
		  
			resto = i%2;
			
			
			
		    if ((resto==0) && (num_Pares<numero_Usuario)){
				System.out.println("el numero es par"+i);
				num_Pares++;
			}
		
		}
		/*public static void main (Strings[]args){
		 *   int n_ped= pedir_Numero();
		 *   int cont =0;
		 *   while(n_ped>0){
		 *     if (cont %2 =0){
		 *     Syso.out.pr(cont)
		 *     n_ped--;
		 *     }
		 *     cont++;
		 *   }
		 *   
		 *   otra forma 
		 *   
		 *   int pares_Aparecidos=0;
		 *   int pares_quiere=0;
		 *   int cont =0;
		 *   pares_quiere=pedirNumero();
		 *   while (pares_aparecidos == pares_quiere){
		 *   if (cont % 2==0){
		 *   Syso. (cont);
		 *   pares_aparecidos++;
		 *   }
		 *   }
		 *   
		 * */
		
	}

}
