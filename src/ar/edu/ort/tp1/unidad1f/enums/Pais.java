package ar.edu.ort.tp1.unidad1f.enums;

/*
 * Un enum es como una clase, tiene atributos y métodos.
 * La única diferencia es que siempre serán publicos, estaticos y finales
 */

public enum Pais {
	FRANCIA,
	BRASIL,
	URUGUAY,
	PARAGUAY,
	VENEZUELA,
	CHILE,
	COLOMBIA;
	
	/*
	 * Puedo agregar métodos como si fuese una clase.
	 * Por ejemplo puedo sobreescribir el método toString
	 */
	@Override
	public String toString() {
		return "Pais: " + name();
	}
}