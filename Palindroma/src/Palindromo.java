
public class Palindromo {
	
	public static boolean es_Palindroma(String cad){
		boolean es_Palin=false;
		int inicio=0;
		int fin=cad.length()-1;
		
		
		
		
		return es_Palin;
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		int inicio = 0;
		String Palabra="dale arroz a la zorra el abad";
		int fin= Palabra.length()-1;
		boolean es_Palindroma = false;
		
		while (Palabra.charAt(inicio)==Palabra.charAt(fin) && (inicio<fin)){							
				fin--;
				es_Palindroma = true;
			    inicio++;
		}
		
		if (es_Palindroma)
			System.out.println(Palabra + " es un PALINDROMO");
		else
			System.out.println(Palabra + " NO es un palindromo");

	}

}
