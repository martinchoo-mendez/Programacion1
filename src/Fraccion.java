package practica1;

/*Ejercicio 1

Teniendo en cuenta la siguiente clase en Java
public class Fraccion {
	int numerador;
	int denominador;
}

*/

public class Fraccion {
	
	int numerador;
	int denominador;
	
	//a) Escribir el constructor Fraccion(int numerador, int denominador)
	
	public Fraccion (int numerador, int denominador) {
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	/*b)Escribir el método de instancia void imprimir() que imprime en pantalla la fracción en algún
	formato cómodo. Crear en un main una Fraccion e imprimirla con este método*/
	
	public void imprimir () {
		System.out.println(this.numerador + "/" + this.denominador);
	}
	
	/*c)Escribir el método de instancia void invertirSigno() que invierte el signo del número: si era
	negativo pasa a ser positivo y viceversa.*/
	public void invertirSigno() {
		this.numerador = this.numerador * -1;
		System.out.println(this.numerador + "/" + this.denominador);
	}
	
	/*d) Escribir el método de instancia void invertir() que invierte el numerador y el denominador de
	la fracción. Ej. invertir(1/2) = 2/1.*/
	public void invertir () {
		int aux = this.numerador;
		this.numerador = this.denominador;
		this.denominador = aux;
		System.out.println(numerador + "/" + denominador);
	}
	
}

