package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_3 {

	public static void main(String[] args) {

		/**
		 * area y volumen de un cilindro
		 */

		final double  pi = Math.PI;
		
		double radio = 5;
		
		double altura = 10;
		
		
		/*
		double area = ( pi * (Math.pow(radio, 2)));
		double volumen = (area *altura);

		System.out.println("cilindro area: "+Math.round(area));
		System.out.println("cilindro volumen: "+Math.round(volumen));
		*/
		
		double areaLateral = 2 * pi *radio * altura;
		double areaTotal = (2 * pi * radio * altura) + (2* pi * Math.pow(altura, 2));
		double volumen = (pi * Math.pow(radio, 2)) * altura;
		System.out.println("area lateral: " + areaLateral);
		System.out.println("area total: " + areaTotal);
		System.out.println("volumen: " + volumen);
		
		
		
		
	}

}
