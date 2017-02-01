import java.util.Scanner;


public class Notas {
	
	
	public static int pedirNota(){
		   int nota = 0;
		   Scanner sc = null;
		   
		   sc = new Scanner(System.in);
		   nota = sc.nextInt();
		   
		   return nota;
		   }
	public static boolean evaluacion (int nota){
		boolean bul = false;
		 if (nota < 5){
			 bul = true;// Suspendiste.
		 }
		 else {
			 bul = false;// aprobaste.
		 }
		 return bul;
	}

	public static void main(String[] args) {
		int nota_Intro=0;
		
		do{
			System.out.println("Dame nota");
			nota_Intro=pedirNota();
			if(evaluacion(nota_Intro)){
				System.out.println("suspensiste");
				
			}
		
		}while(evaluacion(nota_Intro));
			System.out.println("Aprobaste");
		
		
		
		

	}

}
