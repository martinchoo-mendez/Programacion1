package practicaObjetos2;

public class Pruebas {

	public static void main(String[] args) {
		
		Fecha f = new Fecha (10, 3, 2024);
		
		//1)
		//System.out.println(Fecha.diasDelMEs(2, 2023));
		
		//2)
		//System.out.println(f.esValida());
		
		//3)
		//f.avanzarDia();
		
		//4)
		Fecha f2 = new Fecha (11, 4, 2023);
		System.out.println(f.antesQue(f2));
	}

}
