package recursionArreglos;

//con String

public class Ejercicio {
	
	public static String resto (String s) {
		String nuevo = "";
		for (int i = 1; i<s.length();i++) {
			nuevo += s.charAt(i);
			}
		return nuevo;
	}
	
	public static boolean pertenece (char c, String s) {
		if(s.length()==0) {
			return false;
		}
		if (s.charAt(0)==c) {
			return true;
		}
		else {
			return pertenece(c, resto(s));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
