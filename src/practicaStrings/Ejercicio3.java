package practicaStrings;

//Hacer una función que se llame public static boolean sonIguales(String s1, String s2) y devuelva true si ambos String
//son iguales. No usar el método .equals().

public class Ejercicio3 {
	
	public static boolean sonIguales (String s1, String s2) {
		String cadenaCorta = "";
		if (s1.length()<s2.length()) {
			cadenaCorta += s1;
		}
		else {
			cadenaCorta += s2;
		}
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		for (int i = 0; i<cadenaCorta.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String cadena1 = "Pepe";
		String cadena2 = "Hola";
		System.out.println(sonIguales(cadena1, cadena2));
	}

}
