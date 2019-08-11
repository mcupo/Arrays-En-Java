package ar.edu.ort.tp1.unidad1c.valoresiniciales;

public class ValoresIniciales {

	private static final int DECENA 		= 10;
	private static final int MEDIA_DECENA	= 5;
	private static final int CANT_ALUMNOS	= 6;
	
	private static int 	   [] decena 		= new int[DECENA];
	private static char	   [] abecedario	= new char[26];
	private static boolean [] aprobados 	= new boolean[CANT_ALUMNOS];
	private static Integer [] mediaDecena 	= new Integer[MEDIA_DECENA];
	
	public static void main(String[] args) {
		
		//JAVA inicializa en cero a los arrays de tipo númerico
		System.out.println("Valores para el array decena");
		for(int i = 0; i < decena.length; i++){
			System.out.println("Valor en posicion " + i + ": " + decena[i]);
		}
		
		//JAVA inicializa en el caracter null (\u0000) a los arrays de tipo char
		//Por consola veremos un cuadrado, esto es para indicar que no es un caracter que pueda ser mostrado
		System.out.println("Valores para el array abecedario");
		for(int i = 0; i < abecedario.length; i++){
			System.out.println("Valor en posicion " + i + ": " + abecedario[i]);
		}
		
		//JAVA inicializa en false a los arrays de tipo boolean
		System.out.println("\nValores para el array aprobados");
		for(int i = 0; i < aprobados.length; i++){
			System.out.println("Valor en posicion " + i + ": " + aprobados[i]);
		}
		
		//JAVA inicializa en NULL a los arrays de objetos
		System.out.println("\nValores para el array mediaDecena");
		for(int i = 0; i < mediaDecena.length; i++){
			System.out.println("Valor en posicion " + i + ": " + mediaDecena[i]);
		}
	}
}