package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_10 {

	public static void main(String[] args) {
		/**
		 * calcula eneregia cinetica
		 */
		
		//g
		float masa = 100;
		//m/s
		float velocidad = 350;
		
		double energia = 0.5 * masa * velocidad;
		
		System.out.println("la energía cinetica es: " + energia);
		

	}
	
	/**
	 * CALCULA ENERGIA CINETICA DE UNA MASA EN BASE A SU VELOCIDAD
	 * @param masa
	 * @param velocidad
	 * @return
	 */
	public static double calculaEnergiaCinetica(float masa, float velocidad) {
		double energia = 0.5 * masa * velocidad;
		return energia;
	}

}
