package practica0;

/*Escribir un método static void ponerNota(double x, double y) que toma dos números decimales y los promedia. En caso que
el promedio sea mayor o igual a 7, deberá imprimir ‘‘Promocionado’’, si es mayor o igual a 4 pero menor que 7, imprime
‘‘Aprobado’’ y si es menor que 4 imprime ‘‘Debe recuperar’’. Probarla llamándola desde el main con distintos números.
Luego, pedirle ambos números al usuario (usando nextFloat() del Scanner) para pasárselos a ponerNota.*/

import java.util.Scanner;

public class Ejercicio8 {

	public static void ponerNota (double x, double y) {
		
		double promedio = (x + y)/2.0;
		
		if (promedio >= 7) {
			System.out.println("Promocionado");
		}
		else if (promedio >= 4 && promedio < 7) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Debe recuperar");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una primer nota: ");
		double nota1 = scan.nextFloat();
		
		System.out.println("Ingrese una segunda nota: ");
		double nota2 = scan.nextFloat();
		
		ponerNota(nota1, nota2);
		
		scan.close();

	}

}
