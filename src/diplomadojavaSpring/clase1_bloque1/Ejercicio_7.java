package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_7 {

	public static void main(String[] args) {
		/**
		 * distancia euclidiana(en grados)
		 */
		
		double[] coor1 = {-32.100, -71.2};
		double[] coor2 = {-32.200, -72.1};
		
		double distancia = Math.sqrt(
				Math.pow(coor1[0]-coor2[0], 2) + 
				Math.pow(coor1[1]-coor2[1], 2)
				);
		
		System.out.println("distancia: " + distancia);
		

	}

}
