import java.util.Scanner;


public class Persona {
	
	//seccion de atributos
	private String nombre;
	private int edad;
	//fin de seccion 
	
	
	//seccion metodos 
	
	public Persona(String nombre_r, int edad_r){
		this.nombre = nombre_r;
		this.edad= edad_r;
	}
	public Persona(){}
	
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static String pedirNombre(){
    	
    	    String nombre_Pedido = null;
    	    Scanner sc = null;
	   		   
		   sc = new Scanner(System.in);
		   nombre_Pedido = sc.nextLine();
		   
		   return nombre_Pedido;
		   
    }
    
    public static int pedirEdad(){
    	int edad=0;
    	Scanner sc = null;
    
    		sc = new Scanner (System.in);
    		edad= sc.nextInt();
		  
		return edad;
    	
    }
	public  void  mostrarPersona(){
		
		System.out.println("nombre igual " + this.nombre+ "y su edad es "+ this.edad );
		
		Scanner scanner= null;
		scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		System.out.println(nombre);
	}
	
	

}
