import java.util.Scanner;


public class Random {
	
	public static int pedirNumero(){
		int numero_Intro=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero_Intro= sc.nextInt();	
		
		return numero_Intro;
		
	}
	
  public static void numero_Acertado (int numero_Metido, int numeroRandom){//las variables que llegan seran el numero pedido y el numero random pedido en el main
		
		
			if (numero_Metido < numeroRandom){
				
				System.out.println("el numero Introducido es menor que el numero Aleatorio  ");	
			}
			else if(numero_Metido>numeroRandom){
				System.out.println("el numero Introducido es mayor que el numero Aleatorio");
				
			}
			else {
				
				System.out.println("el numero "+ numero_Metido + "es igual "+numeroRandom  +"has acertado");
			}
			
			
		
		
		
		
	}
		
 public static void main(String[] args) {
		//Declaracion de variables
		int numero_Metido=0;
		int intentos=5;
		int numeroRandom=(int)(100*Math.random()+1);//me creo un numero random
		
		
		while( intentos != 0 && numeroRandom!=numero_Metido){//esta es la condicion que llamara al metodo y comprobara hasta que aciertes o te quedes sin opciones
			numero_Metido=pedirNumero();
		    numero_Acertado(numero_Metido, numeroRandom);
			intentos--;
		}
		if (numeroRandom!=numero_Metido){// esta condicion te dire que si no son iguales y has echo 5 intentos se salga y te muestre se han acabado los intentos
			System.out.println("Se te han acabado los intentos");
			
		}
		
      

	}

}
