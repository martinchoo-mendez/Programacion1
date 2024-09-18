package practicaObjetos2;

public class Fecha {
	
	int dia;
	int mes;
	int anio;
	
	public Fecha (int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}
	
	public static boolean esBisiesto (int anio) {
		return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0); 
	}
	
	/*1. public [static?] int diasDelMes(int mes, int anio)
	Devuelve la cantidad de días del mes dado, en el año dado.*/
	public static int diasDelMEs (int mes, int anio) {
		if (mes >= 1 && mes <= 12) {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				return 31;
			}
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				return 30;
			}
			if (mes == 2 && esBisiesto(anio)) {
				return 29;
			}
			else {
				return 28;
			}
		}
		return 0;
	}
	
	/*2. public [static?] boolean esValida()
	Devuelve true si la fecha es válida, y false en caso contrario.*/
	public boolean esValida () {
		if (this.mes >= 1 && this.mes <= 12) {
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
				if (this.dia >= 1 && this.dia <= 31) {
					return true;
				}
			}
			if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
				if (this.dia >= 1 && this.dia <= 30) {
					return true;
				}
			}
			if (mes == 2 && esBisiesto(this.anio)) {
				if (this.dia >= 1 && this.dia <= 29) {
					return true;
				}
			}
			if (mes == 2 && !esBisiesto(this.anio)) {
				if (this.dia >= 1 && this.dia <= 28) {
					return true;
				}
			}
		}
		return false;
	}
	
	/*3. public [static?] void avanzarDia()
	Hace avanzar un día a la fecha.*/
	public void avanzarDia () {
		System.out.println(this.dia + 1 + "/" + this.mes + "/" + this.anio);
	}
	
	/*4. public [static?] boolean antesQue(Fecha otra)
	Devuelve true si la fecha está antes que la fecha recibida como parámetro.*/
	public boolean antesQue (Fecha otra) {
		if (this.anio < otra.anio) {
			return true;
		}
		if (this.anio == otra.anio) {
			if (this.mes == otra.mes) {
				if (this.dia < otra.dia) {
					return true;
				}
			}
			if (this.mes < otra.mes) {
				return true;
			}
		}
		return false;
	}	
}
