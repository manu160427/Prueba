
public class ejecutar_Argumentos {

	public static void main(String[] args) {
		int longitud_mayor=0;
		String palabra_longiMayor=null;
		int idioma = args.length;
		
		
		
		for(int i=0; i<idioma; i++){
			
			if(args[i].length()>longitud_mayor){
				longitud_mayor=args[i].length();
				palabra_longiMayor=args[i];
				
			}
			
			
		}
        System.out.println("El argumento mayor es: "+palabra_longiMayor +"\n-"+"y el numero de argumentos  es: "+ idioma);
		
	

}
}
