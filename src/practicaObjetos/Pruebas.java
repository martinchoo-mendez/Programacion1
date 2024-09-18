package practicaObjetos;

public class Pruebas {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha (10, 9, 2024);
		System.out.println(f1.dia);
		Fecha f2 = new Fecha (10, 9, 2024);
		System.out.println(f2.dia);
		
		f1.imprimir(); //método de instancia
		Fecha.imprimir(f1); //método de clase
		
		System.out.println(f1.esPrimavera());
		System.out.println(f1.equals(f2));
		System.out.println(Fecha.esBisiesto(2000));
	}

}
