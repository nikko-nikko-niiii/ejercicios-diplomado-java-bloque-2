package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		/**
		 * area y perimetro de un circulo
		 */

		final double  pi = Math.PI;
		
		double radio = 5;
		
		double perimetro = Math.round( pi * (radio * 2));
		
		double area = Math.round( pi * (Math.pow(radio, 2)));
		
		System.out.println("circulo area: "+area);
		System.out.println("circulo perimetro: "+perimetro);
		
		
		
	}

	/**
	 * calcula area de un circulo en base a un radio
	 * @param radio
	 * @return
	 */
	public static double areaCirculo(double radio) {
		final double  pi = Math.PI;
		
		double area = Math.round( pi * (Math.pow(radio, 2)));
		
		return area;
	}

	/**
	 * caclula perimetro de un circulo en base a un radio
	 * @param radio
	 * @return
	 */
	public static double perimetroCirculo(double radio) {
		final double  pi = Math.PI;
		
		double perimetro = Math.round( pi * (radio * 2));
		
		return perimetro;
	}

}
