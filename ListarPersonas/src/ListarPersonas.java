


public class ListarPersonas {
	
	public final static int TAMANIO_LISTA = 5;
	
	private Personas[] lista_personas;
	
	private int num_personas;
	
	
	public ListarPersonas ()
	{
		this.lista_personas = new Personas[TAMANIO_LISTA];
		this.num_personas = 0;
		/*for (int i = 0; i < lista_personas.length; i++)
		{
			lista_personas[i]=null;//esto lo hace el compilador por nosotros
		}*/
		
	}
	
	public Personas obtenerPersona (int pos)
	{
		Personas persona_pos = null;
		
			persona_pos = lista_personas[pos];
		
		return persona_pos;
	}
	
	/**
	 * 
	 * M�tdo que inserta un objeto Persona
	 * en la lista de personas
	 * 
	 * @param persona La persona que se quiere introducir
	 * @return true si la operaci�n fue existosa, false, si no cab�an m�s
	 */
	public boolean insertarPersona (Personas persona)
	{
		boolean insertada = false;
		
			if (this.num_personas<TAMANIO_LISTA)
			{
				//inserto
				this.lista_personas[num_personas]= persona;
				insertada = true;
				this.num_personas++;
			} 
			else 
			{
				System.out.println("La lista est� llena");
				insertada = false;
			}
		
		return insertada;
	}

	/**
	 *M�todo que permite buscar a una persona
	 *por su nombre en la lista
	 * 
	 * @param nombre El nombre de la persona a buscar
	 * @return un -5 si la persona no est� o el n�mero de posici�n donde est�
	 */
	public int buscarPersonaPos (String nombre)
	{
		int pos_persona = -5;
		int pos = 0;
		boolean encontrado = false;
		Personas persona_aux = null;
		while (!encontrado && pos < num_personas)
		{
			persona_aux = this.lista_personas[pos];
			if (persona_aux.getNombre().equals(nombre))
			{
				encontrado = true;
				pos_persona = pos;
			}
			pos ++;
			
		}
		return pos_persona;
		
	}
	public void listarPersonas ()
	{
		Personas persona_actual = null;
		
		for (int i = 0; i < this.num_personas; i++) {
			persona_actual = lista_personas[i];
			persona_actual.mostrarPersona();
			
//			System.out.println(persona_actual.getEdad()); //m�todo alternativo
//			System.out.println(persona_actual.getNombre());// el otro es el preferido por favorecer la encapsulaci�n y la reutilizaci�n
		}
	}

}

