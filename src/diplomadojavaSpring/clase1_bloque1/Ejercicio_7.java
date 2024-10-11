package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_7 {

	public static void main(String[] args) {
		/**
		 * distancia euclidiana(en grados)
		 */
		
		double[] coor1 = {-33.13960018722044, -70.07519971686143};
		double[] coor2 = {-33.2382804087118, -71.67765056816161};
		
		double distancia = Math.sqrt(
					Math.pow(coor1[0]-coor2[0], 2) 
					+ 
					Math.pow(coor1[1]-coor2[1], 2)
				);
		
		System.out.println("distancia: " + distancia);
		

	}

}
