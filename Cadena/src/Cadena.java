
public class Cadena {
	public static void main(String[] argumentos) {
		 
		/*System.out.println("primera palabra= "+ argumentos[0]);
		System.out.println("Segunda palabra= "+ argumentos[1]);
		System.out.println("Tercera palabra= "+ argumentos[2]);
		*/
		int n_palabras = argumentos.length;
		System.out.println( n_palabras);
		
		
		for(int i=0; i<n_palabras; i++){
			System.out.println("las palabra " +i+""+argumentos[i]);
		}
	}

}
