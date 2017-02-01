import java.util.Scanner;


public class OtraSolucion {
	
	public static double pedirNumero(){
		double pedirNumero= 0;
		
		Scanner scanner= new Scanner (System.in);
		 pedirNumero = scanner.nextDouble();
		 return pedirNumero;
	}
	public static vernumero(){
		//iff anidados
	}

	public static void main(String[] args) {
		double primero=0;
		double segundo=0;
		double tercero=0;				
						
						
						//fin de seccion de declaracion

						System.out.println("introduzca su primer numero");
						primero = pedirNumero();//obtengo el numero1

						System.out.println("introduzca el numero1");
						segundo = pedirNumero();//obtengo el numero 2


						System.out.println("introduzca el numero2");
						tercero = pedirNumero();//obtengo el numero 3
						
						 verNumMayor( primero, segundo,  tercero);
		
		

	}

}
