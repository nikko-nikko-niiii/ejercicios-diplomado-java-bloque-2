package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_1 {

	public static void main(String[] args) {

		/**
		 * area y perimetro de un rectangulo
		 */
		
		
		double largo = 16.8;
		double alto = 4.754;
		
		double area = largo * alto;
		double perimetro = (largo*2) + (alto*2);
		
		perimetro = Math.round(perimetro);
		
		
		
		System.out.println("alto: " + alto);
		System.out.println("largo: "+largo);
		
		System.out.println("area: " + area);
		System.out.println("perimetro: " + perimetro);
		
		
		
	}
}
