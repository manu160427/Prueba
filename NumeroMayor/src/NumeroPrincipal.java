import java.util.Scanner;


public class NumeroPrincipal {
	
	public static int pedirNumero() {
		 int numero = 0;
		 Scanner sc= null;

		sc = new Scanner(System.in);
		numero =  sc.nextInt();

		return numero;

	}
	public static void verNumMayor (int numero, int numero1, int numero2 ){
		int numMayor=0;
		
		if (numero > numero1)
		{
			numMayor=numero;
		}
		else
		{
			numMayor=numero1;
		}
		if(numero2>numMayor){
			
			numMayor=numero2;
			
		}
		System.out.println("el numero mayor es "+numMayor);
		
		
		
	}
	
	public static void main(String[] args) {
		//creamos las variables
		//seccion de declaracion
				int numero = 0;
				int numero1 = 0;
				int numero2 = 0;
			
			
				
				
				//fin de seccion de declaracion

				System.out.println("introduzca un numero");
				numero = pedirNumero();//obtengo el numero1

				System.out.println("introduzca el numero1");
				numero1 = pedirNumero();//obtengo el numero 2


				System.out.println("introduzca el numero2");
				numero2 = pedirNumero();//obtengo el numero 3
				
				 verNumMayor( numero, numero1,  numero2);
		
		
		

	}

}
