package practicaRecursion;

public class Ejemplo_string {
	
	public static String resto (String s) {
		String nuevo = "";
		for (int i = 1; i<s.length(); i++) {
			nuevo += s.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean pertenece (char c, String s) {
		if (s.length() == 0) {
			return false;
		}
		if (s.length() == 1) {
			return s.charAt(0) == c;
		}
		if(s.charAt(0) == c) {
			return true;
		}
		else {
			return pertenece (c, resto(s));
		}
	}

	public static void main(String[] args) {

		String s = "casa";
		char c = 'c';
		System.out.println(pertenece(c, s));
	}

}
