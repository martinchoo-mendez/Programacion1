package practicaStrings;

//Hacer una función que devuelva true si el String está compuesto solamente por letras 'e', y false en caso contrario.

public class Ejercicio2 {

	public static boolean soloE (String s) {
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) != 'e') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String cadena = "eeee";
		System.out.println(soloE(cadena));
	}

}
