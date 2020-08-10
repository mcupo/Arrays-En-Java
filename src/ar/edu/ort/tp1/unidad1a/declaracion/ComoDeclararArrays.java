package ar.edu.ort.tp1.unidad1a.declaracion;

public class ComoDeclararArrays {
	
	/*
	 * Cada par de corchetes [] indica una dimensi�n o eje de la estructura. Por eso, para 
	 * agregar una nueva dimensi�n lo �nico que debemos hacer es agregar un nuevo par de 
	 * corchetes.
	 */
	private static String [] diasDeLaSemana;
	
	/*
	 * Necesitamos recrear la siguiente estructura:
	 * 			N�mero de Parcial
	 * 		A		|	|	|
	 * 		l		|	|	|
	 * 		u		|	|	|
	 * 		m		|	|	|
	 * 		n		|	|	|
	 * 		o		|	|	|
	 */
	private static float [][] notasCurso1C;
	
	/*
	 * En ambos casos s�lo tenemos una �nica referencia a cada una de las 
	 * estructuras, pues en Java los Arrays son objetos. Java no crea toda la estructura en 
	 * este momento pues no sabe cu�l ser� el tama�o que queremos darle. Para eso, debemos definirlos
	 */
	
	/* 
	 * Existen 2 formas de definir un Array, la primera es a trav�s de la sentencia "new".
	 * - Este valor no tiene por qu� ser un valor constante; simplemente debe ser un valor conocido al momento de 
	 * definir el tama�o, y puede provenir de variables, operaciones matem�ticas o cualquier
	 * otra instrucci�n que genere un n�mero, siempre y cuando ese n�mero sea un valor entero positivo.
	 * - Como buena pr�ctica debemos usar constantes para declarar las dimensiones
	 */
	private static final int DECENA 		= 10;
	private static final int CANT_ALUMNOS 	= 6;//Filas
	private static final int CANT_PARCIAES 	= 2;//Columnas
	
	private int [] decena = new int[DECENA];
	private float [][] notasCurso1B = new float[CANT_ALUMNOS][CANT_PARCIAES];
	
	/*
	 * La otra forma de definir un Array es seteandole valores directamente.
	 * En este caso el tama�o va a estar dado por los valores que hayamos seteado, en este caso 4.
	 */
	private String [] estacionesDelAnio = { "Verano", "Oto�o", "Invierno", "Primavera"};
	
	//Para una estructura de 2 dimensiones, se define asi:
	private float [][] notasCurso1A = { {7,9}, {2,5}, {10,1}, {8,4}, {7,7}, {6,5} };
	
	/*
	 * Para el caso de los arrays con m�s de una dimensi�n, no es necesario que que las dimensiones
	 * internas midan lo mismo. Este ejemplo lo podemos ver como un Array que contiene otros Arrays.
	 * Los gupos de caracteres que pertenecen a la segunda dimensi�n miden 4, 2, 6 y 2 respectivamente.
	 */
	private static char [][] algunasLetras = { { 'A', 'B', 'C', 'D' }, { 'E', 'F' }, { 'G',
		'H', 'I', 'J', 'K', 'L' }, { 'M', 'N' } };
	
	public ComoDeclararArrays(){
	/*
	 * Si voy a definir el contenido un array luego de su declaraci�n, debo hacerlo de la siguiente manera:
	 */
		diasDeLaSemana = new String [] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		//Si intentamos definirlo sin el new, el compilador arrojara un error:
		//diasDeLaSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
	}
	
	public static void main(String[] args) {
		
	}
}