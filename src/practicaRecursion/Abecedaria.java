package practicaRecursion;

public class Abecedaria {
	
	public static String resto (String s) {
		String nuevo = "";
		for (int i = 1; i<s.length(); i++) {
			nuevo += s.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean esAbecedaria (String s) {
		if (s.length() <= 1) {
			return true;
		}
		if (s.charAt(0)>s.charAt(1)) {
			return false;
		}
		else {
			return esAbecedaria(resto(s));
		}
		
	}

	public static void main(String[] args) {
		
		String s = "adios";
		//String p = "Hola";
		System.out.println(esAbecedaria(s));
		//System.out.println(esAbecedaria(p));
	}

}
