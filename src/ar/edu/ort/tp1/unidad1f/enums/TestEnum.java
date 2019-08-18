package ar.edu.ort.tp1.unidad1f.enums;

public class TestEnum {

	public static void main(String[] args) {
		
		/*
		 * Podemos recorrer la lista de constantes Enum invocando el método values() para dicha enumeración. 
		 * El método values() genera un vector con las constantes enum en el orden en que fueron declaradas, 
		 * de modo que podemos utilizar el vector resultante en, por ejemplo un for.
		 * Debemos utilizar las llaves para acceder al índice del mismo, y luego llamar al método name(), 
		 * que nos devolverá el valor del Enum en dicha posición.
		 */
		for (int i=0; i<Pais.values().length; i++) {
			System.out.println(Pais.values()[i].name());
		}
		
		/*
		 * Al tratarse de un vector, podemos conocer su tamaño utilizando la propiedad length:
		 */
		System.out.println(Pais.values().length);
		
		/*
		 * Para acceder a algun dato del Enum, solamente debemos escribir el nombre del Enum.Dato,
		 * por ejemplo:
		 */
		System.out.println(Pais.BRASIL);
		
		/*
		 * Podemos conocer la posición de un dato en el Enum llamando al método ordinal(), por ejemplo Brasil
		 * se encuentra en la posición 1:
		 */
		System.out.println(Pais.BRASIL.ordinal());
		
		/*
		 * Podemos comparar los Enums con otros objetos, por ejemplo si queremos comparar el valor en formato String
		 * del pais Brasil:
		 */
		System.out.println(Pais.BRASIL.toString().equalsIgnoreCase("Brasil"));
		
		/*
		 * Podemos llamar a los métodos que creamos o sobreescribimos del Enum, como lo hacemos con un objeto,
		 * por ejemplo:
		 */
		System.out.println(Pais.BRASIL.toString());
	}
}