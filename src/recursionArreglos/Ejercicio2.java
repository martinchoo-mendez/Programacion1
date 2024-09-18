package recursionArreglos;

public class Ejercicio2 {
	
	public static boolean perteneceDesde (int[] a, int e, int pos) {
			if (pos>=a.length) {
				return false;
			}
			if (a[pos]==e) {
				return true;
			}
			else {
				return perteneceDesde(a, e, pos+1);
			}
	}
	
	public static int[] resto (int[] a) {
		int [] b = new int[a.length - 1];
		for (int i = 1; i<a.length; i++) {
			b[i-1] = a[i];
		}
		return b;
	}
	
	public static boolean pertenece (int [] a, int e) {
		if (a.length==0) {
			return false;
		}
		if (a[0]==e) {
			return true;
		}
		else {
			return pertenece(resto(a), e);
		}
	}


	public static void main(String[] args) {
		int [] a = new int [3];
		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		System.out.println(pertenece(a, 5));
	}

}
