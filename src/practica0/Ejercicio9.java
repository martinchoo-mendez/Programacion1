package practica0;

/*Escribir un método static void imprimirFecha(int dia, int mes, int anio) que imprime la
fecha pasada como parámetro en formato del estilo “5 de Julio de 2030”.*/

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void imprimirFecha (int dia, int mes, int anio) {
		
		switch (mes) {
		case 1 : System.out.println(dia + " de Enero de " + anio); break;
		case 2 : System.out.println(dia + " de Febrero de " + anio); break;
		case 3 : System.out.println(dia + " de Marzo de " + anio); break;
		case 4 : System.out.println(dia + " de Abril de " + anio); break;
		case 5 : System.out.println(dia + " de Mayo de " + anio); break;
		case 6 : System.out.println(dia + " de Junio de " + anio); break;
		case 7 : System.out.println(dia + " de Julio de " + anio); break;
		case 8 : System.out.println(dia + " de Agosto de " + anio); break;
		case 9 : System.out.println(dia + " de Septiembre de " + anio); break;
		case 10 : System.out.println(dia + " de Octubre de " + anio); break;
		case 11 : System.out.println(dia + " de Noviembre de " + anio); break;
		case 12 : System.out.println(dia + " de Diciembre de " + anio); break;
		default: System.out.println("Mes no válido");
		}
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el día: ");
		int dia = scan.nextInt();
		
		System.out.println("Ingrese el mes: ");
		int mes = scan.nextInt();
		
		System.out.println("Ingrese el año: ");
		int anio = scan.nextInt();
		
		imprimirFecha(dia, mes, anio);
		
		scan.close();

	}

}
