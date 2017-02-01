package edu.femxa.val;

import java.util.Scanner;

public class Principal {

	/*
	 * pido un numero por teclado double al usuario y Return el numero
	 * introducido por el usuario
	 */

	/*
	 * public static double pedirNumeroDouble() {
	 * 
	 * double numLeido = 0;
	 * 
	 * Scanner scanner = new Scanner(System.in);// me creo el objeto scaner //
	 * para leer de teclado. numLeido = scanner.nextDouble();// leo de teclado y
	 * asigno el valor a // numLeido.
	 * 
	 * return numLeido;
	 * 
	 * }
	 */
	public static float pedirNumeroFloat() {
		float numero = 0;

		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextFloat();

		return numero;

	}
	
	public static float calcularIMC(float peso,float altura){
		 float imc=0;
		 imc = peso / (altura * altura);
		 return imc;
		 
		
		
	}
	/*Informo al usuario del IMC Cualitativo
	 * Imc= valor numerico o cuantitativo del IMC
	 */
	public static void mostrarResultadoIMC (Float imc){
		if (imc < 16){
			System.out.println("Esta desnutrido");
		}
		   
			else if ((imc >= 16) && (imc < 18.5)) 
		     {		    	 
			    System.out.println("bajo de peso");
		     } 
	
				else if ((imc >= 18.5) && (imc < 25)) 
		        {
		        	System.out.println("normal");			          
		         } 

		       
		     		else if ((imc >= 25) && (imc < 31))
		             {		         	
			            System.out.println("sobrepeso");			             
		             } 
		            
		     			else if (imc >= 31) 
		                {
		   			           System.out.println("obesidad");
		                }
		
		
	}

	public static void main(String[] args) {
		//seccion de declaracion
		float peso = 0;
		float altura = 0;
		float imc = 0;
		//fin de seccion de declaracion

		System.out.println("introduzca el peso(Kg)");
		peso = pedirNumeroFloat();//obtengo el peso

		System.out.println("introduzca la altura (m)");
		altura = pedirNumeroFloat();//obtengo la altura

		imc=calcularIMC(peso,altura);//calculo el imc
		mostrarResultadoIMC(imc);//muestro el imc
		

		

		/*
		 * double peso=0; double altura=0; double imc=0;
		 * 
		 * System.out.println("introduzca peso en (Kg)"); peso=
		 * pedirNumeroDouble();
		 * 
		 * System.out.println("introduzca altura en (m)"); altura=
		 * pedirNumeroDouble();
		 * 
		 * imc= peso/(altura*altura);
		 * 
		 * System.out.print("su imc es: "+imc);
		 */

		// Primer ejercio.
		/*
		 * pedir peso pedir altura calcular imc=peso/altura*altura mostrar
		 * double peso = 81.7; peso en kg double altura = 1.852; estatura en m
		 * double imc = peso/(altura*altura);
		 * 
		 * System.out.println(imc);
		 */

		/*
		 * // Segundo ejercicio // obtengo peso // obtengo altura // calculo el
		 * imc // y lo muestro con el Syso.
		 * 
		 * //creamos las variables double peso = 0; double altura = 0;
		 * 
		 * //Creamos el objeto escaner Scanner scanner = new Scanner(System.in);
		 * System.out.println("introduzaca peso"); peso = scanner.nextDouble();
		 * 
		 * //creamos el objeto escaner2 Scanner scaner2 = new
		 * Scanner(System.in); System.out.println("introduzca altura"); altura =
		 * scaner2.nextDouble();
		 * 
		 * //calculamos el imc double imc = peso / (altura * altura);
		 * 
		 * //imprimimos imc por pantalla
		 * System.out.println("su indice coreporal es " + imc);
		 */

	}

}
