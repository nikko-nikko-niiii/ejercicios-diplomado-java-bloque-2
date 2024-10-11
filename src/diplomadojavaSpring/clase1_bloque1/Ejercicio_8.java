package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_8 {

	public static void main(String[] args) {
		/**
		 * distancia geodesica
		 * me gano esta, no estoy seguro que sea así >.<'
		 */

		double[] coor1 = {-33.13960018722044, -70.07519971686143};
		double[] coor2 = {-33.2382804087118, -71.67765056816161};
		double radio = 6378.137;
		

		double restalons = gradtorad(coor1[1]) - gradtorad(coor2[1]);
		double sumalats = gradtorad(coor1[0]) + gradtorad(coor2[0]);
		double restalats = gradtorad(coor1[0]) - gradtorad(coor2[0]);
		
		double cosSumaLats = Math.cos(sumalats/2);
		double resultado = radio * Math.sqrt(
					(restalons*Math.pow(cosSumaLats, 2))+restalats
				);
		
		System.out.println("distancia: "+ resultado);
		
		
	}


	static double gradtorad(double grad) {
		return grad * (Math.PI /180);
	}

}
