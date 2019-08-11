package ar.edu.ort.tp1.unidad1d.recorrerarrays;

public class BComoRecorrerArraysDeObjetos {

	private static Persona [] personas = new Persona[5];
	
	public static void main(String[] args) {
		
		personas[3] = new Persona("Juan", 40);
		personas[4] = new Persona("Pedro", 18);
		
		/*
		 * Como los arrays de Objetos se inicializan en NULL, SIEMPRE debo verificar si son distintos de NULL
		 * antes de acceder a ellos.
		 * En este ejemplo, no todas las posiciones poseen una referencia a Persona.
		 */
		for (int i=0; i < personas.length; i++) {
			if (personas[i] != null) {
				System.out.println(personas[i].toString());
			}
		}
	}
}