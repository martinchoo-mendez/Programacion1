package practicaObjetos;

public class Fecha {
	int dia;
	int mes;
	int anio; //variables de instancia
	
	public Fecha (int d, int m, int a) { //método que es un constructor para poder usar el new
		this.dia = d;
		this.mes = m; //a cada variable de instancia del objeto le asigno cada valor
		this.anio = a;
		
		//this representa al objeto que se está creando
	}
	
	public Fecha () { //otro constructor que no toma parametros
		this.dia = 1;
		this.mes = 1;
		this.anio = 2024;
	}
	
	//los constructores pueden llamarse igual, pero deben variar el tipo de datos que tienen como parámetros o la
	//misma tupla Por ejemplo, en dos constructores no pueden haber dos tipos de documentos.
	
	
	//me creo un MÉTODO de instancia que imprima este objeto
	
	public void imprimir () { //al no tener static, es un método de instancia y es void porque solo imprime
		
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);  //this hace referencia a la variable que se 
																		  //encuentra delante del método
	}
	
	public static void imprimir (Fecha f) { //al tener static es un método de clase y no necesita crear una instancia
		System.out.println(f.dia + "/" + f.mes + "/" + f.anio); 
	}
	
	public boolean esPrimavera () {
		if (this.mes == 10 || this.mes == 11) {
			return true;
		}
		if (this.mes == 9 && this.dia >= 21) {
			return true;
		}
		if (this.mes == 12 && this.dia < 21) {
			return true;
		}
		
		return false;
	}
	
	public boolean equals (Fecha f) {
		return this.dia == f.dia && this.mes == f.mes && this.anio == f.anio;
	}
	
	public static boolean esBisiesto (int anio) {
		return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0); 
	}
	
}
