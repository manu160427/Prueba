package edu.cam.femxa;

/**
 * @author Alumno
 * @version 1.0
 * @created 12-dic.-2016 17:53:38
 */
public class Main {

	public Main() {

	}

	// aqui se crean los objetos en este caso una persona.
	public static void main(String[] args) {
		//1 PEDIR DATOS PERSONA
		 Persona persona = PedirDatos.pedirDatosPersona();
		
		//2 CALCULAR IMC
		 float imc_persona = CalcularIMC.calcula(persona);
		
		//3
		
	}

} 