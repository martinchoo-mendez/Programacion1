package practicaStrings;

//Hacer una función que tome un String y cuente la cantidad de veces que aparece la letra 'e' ya sea mayúscula o minúscula.
//Probarla en una función main() de pruebas en un archivo aparte.

public class Ejercicio1 {
	
	public static int cantidadDeE (String s) {
		int cont = 0;
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		String cadena = "Elefante";
		System.out.println(cantidadDeE(cadena));
	}

}
