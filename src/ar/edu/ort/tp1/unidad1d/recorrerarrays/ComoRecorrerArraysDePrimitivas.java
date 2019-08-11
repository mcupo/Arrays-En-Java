package ar.edu.ort.tp1.unidad1d.recorrerarrays;

public class ComoRecorrerArraysDePrimitivas {

	private static String [] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", 
			"Viernes", "Sábado", "Domingo"};
	
	private static float [][] notasCurso1A = { {7,9}, {2,5}, {10,1}, {8,4}, {7,7}, {6,5} };
	
	private static char [][] algunasLetras = { { 'A', 'B', 'C', 'D' }, { 'E', 'F' }, { 'G',
		'H', 'I', 'J', 'K', 'L' }, { 'M', 'N' } };
	
	public static void main(String[] args) {
		
		//Usaremos el ciclo FOR, tomando como tope del array el atributo length 
		for (int i=0; i < diasDeLaSemana.length; i++) {
			System.out.println(diasDeLaSemana[i]);
		}
		
		/*
		 * Necesitamos recorrer la siguiente estructura
		 * 			Número de Parcial
		 * 		A		|	|	|
		 * 		l		|	|	|
		 * 		u		|	|	|
		 * 		m		|	|	|
		 * 		n		|	|	|
		 * 		o		|	|	|
		 * Debemos utilizar 2 for anidados:
		 * 1) Siempre empezamos a recorrer las filas con un primer for que recorrera 
		 * la primera dimension
		 * 2) El segundo for lo usamos para recorrer las columnas de cada fila (segunda dimensión)
		 * IMPORTANTE: Si conozco de antemano la estructura del array y se que sus dimensiones internas son fijas,
		 * no necesito validar el length de cada columna
		 */
		System.out.println("\nRecorriendo fila x columna");
		for (int i=0; i < notasCurso1A.length; i++) {
			for (int j = 0; j < notasCurso1A[0].length; j++){
				System.out.println("Alumno n° " + i + " nota parcial n° " + j + ": " + notasCurso1A[i][j]);
			}
		}
		
		//Si quisiera mostrarlo ordenado por parciales en vez de alumnos, debo intercambiar los fors
		System.out.println("\nRecorriendo columna x fila");
		for (int j = 0; j < notasCurso1A[0].length; j++){
			for (int i=0; i < notasCurso1A.length; i++){
				System.out.println("Alumno n° " + i + " nota parcial n° " + j + ": " + notasCurso1A[i][j]);
			}
		}
		
		/*
		 * ¿QUE PASA CON LOS ARRAYS CON DIFERENTES DIMENSIONES INTERNAS?
		 * Debo preguntar por el length en cada fila para evitar un error de índice fuera de rango
		 */
		System.out.println("\nRecorriendo fila x columna");
		for (int i=0; i < algunasLetras.length; i++) {
			//En el índice de la primera dimension, colocamos la variable i en vez de 0
			for (int j = 0; j < algunasLetras[i].length; j++){
				System.out.println("Fila n° " + i + " columna n° " + j + ": " + algunasLetras[i][j]);
			}
		}
	}
}