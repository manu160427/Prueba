
public class Suma {

	public static void main(String[] args) {
		
	//nos declaramos un array de numeros y un double donde guardaremos la media
		int array[] = {0,10,2,6,7,5,4};
		float media = 0;
	
		//bucle for en el cual recorreremos el array y guardaremos en media la suma de cada una de las posiciones 
		for (int i=0; i < array.length; i++) {
			 media = media + array[i];
			}
		
		media = media / array.length;
		
		// mostramos la media
		System.out.println("la media es: "+media);

	}

}
