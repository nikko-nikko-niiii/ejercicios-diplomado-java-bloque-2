package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_8 {

	public static void main(String[] args) {
		/**
		 * distancia geodesica
		 * creo que ahora esta correcto
		 */

		double[] coor1 = {-33.13960018722044, -70.07519971686143};
		double[] coor2 = {-33.2382804087118, -71.67765056816161};
		double radio = 6378.137;
		

		double restalats = gradtorad(coor1[0]) - gradtorad(coor2[0]);
		double restalons = gradtorad(coor1[1]) - gradtorad(coor2[1]);
		
		double sumalats = gradtorad(coor1[0]) + gradtorad(coor2[0]);
		double cosSumaLats = Math.cos(sumalats/2.0);
		
		System.out.println(restalats);
		
		double resultado = radio * Math.sqrt(
					(Math.pow(restalons*cosSumaLats, 2))+Math.pow(restalats,2)
				);
		
		System.out.println("distancia: "+ resultado);
		
		
	}


	static double gradtorad(double grad) {
		return grad * (Math.PI /180);
	}
	
	
	/**
	 * calcula distancia geodesica entre 2 puntos de coordenadas
	 * @param lat1
	 * @param lon1
	 * @param lat2
	 * @param lon2
	 * @return
	 */
	public static double calculaDistanciaGeodesica(double lat1, double lon1, double lat2, double lon2) {
		
		double radio = 6378.137;
		
		double restalats = gradtorad(lat1) - gradtorad(lat2);
		double restalons = gradtorad(lon1) - gradtorad(lon2);
		
		double sumalats = gradtorad(lat1) + gradtorad(lat2);
		double cosSumaLats = Math.cos(sumalats/2.0);
				
		double resultado = radio * Math.sqrt(
					(Math.pow(restalons*cosSumaLats, 2))+Math.pow(restalats,2)
				);

		return resultado;
		
	}

}
