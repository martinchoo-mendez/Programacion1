package practica1;

public class pruebasFraccion {

	public static void main(String[] args) {
		
		int numerador = 12;
		int denominador = 4;
		
		Fraccion fraccion = new Fraccion (numerador, denominador);
		
		fraccion.imprimir();
		
		fraccion.invertirSigno();
		
		fraccion.invertir();

	}

}
