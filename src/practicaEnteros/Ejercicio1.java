package practicaEnteros;

/*a) Implementar la funcion cantDivisores que tome un parametro de tipo entero y calcule la cantidad de divisores
 * de ese entero. (*)
b) Hacer un programa que use la funcion anterior.
c) Averiguar cuantos divisores tienen los siguientes numeros: 45, 2374 y 3529.*/

public class Ejercicio1 {

	//Item a
	public static int cantDivisores (int a) {
		int cantDivisores = 0;
		int i = 1;
		while (i<=a) {
			if (a%i==0) {
				cantDivisores++;
			}
			i++;
		}
		return cantDivisores;
	}
	
	//item b
	public static void main(String[] args) {
		
		int num = 100;
		int divisores = cantDivisores(num);
		System.out.println("El número " + num + " tiene "+ divisores + " divisores");

	}

}

