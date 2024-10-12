package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_5 {

	public static void main(String[] args) {
		/**
		 * convertir metros a millas
		 */
		
		double metros = 2000;
		
		
		double millas = (metros /1000) *0.62;
		
		System.out.println(metros + " metros son " + millas + "millas");

	}
	
	
	/**
	 * calcula millas a partir de metros
	 * @param metros
	 * @return
	 */
	public static double convierteMetrosAmillas(double metros) {

		return  ((metros /1000) *0.62);

	}

}
