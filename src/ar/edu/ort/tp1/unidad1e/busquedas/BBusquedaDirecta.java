package ar.edu.ort.tp1.unidad1e.busquedas;

public class BBusquedaDirecta {

	private static String [] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", 
			"Viernes", "Sábado", "Domingo"};
	
	public static void main(String[] args) {
		
		System.out.println(obtenerDia(-1));
		System.out.println(obtenerDia(8));
		System.out.println(obtenerDia(1));
	}
	
	//La búsqueda directa consiste en posicionarse en una posición predefinda del array,
	//Por ejemplo yo se que el día de la semana esta representando como un array de números,
	//por lo que si quiero obtener el día Lunes, debo posicionarme sobre el indice 0
	public static String obtenerDia(int i){
		String dia = "No existe un dia con ese número";
		if(i> diasDeLaSemana.length || i<=0)
			return dia;
		else
			return diasDeLaSemana[i-1];
	}
}