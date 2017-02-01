
public class Persona {
	
	private int edad;
	private String nombre;
	
	public int getEdad() {//para leer la edad
		return edad;
	}
	public void setEdad(int edad) {//asiganar la edad
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	} 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public Persona ()
	{
		//me crea una persona vac�a
	}
	
	public void mostarPersona ()
	{
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Edad = " + this.edad);
	}
	
	

}

