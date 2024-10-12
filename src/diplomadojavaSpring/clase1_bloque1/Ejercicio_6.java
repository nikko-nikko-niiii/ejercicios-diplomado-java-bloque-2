package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_6 {

	public static void main(String[] args) {
		/**
		 * celcius a farenheit (o como se escriba)
		 */
		
		float celcius = 15;
		
		double far = (celcius * 1.8)+32;
		
		System.out.println(celcius + "celcius en farenheit es: " +far);
		
	}
	
	/**
	 * convierte grados celcius a fareheit
	 * @param celcius
	 * @return
	 */
	public static double convierteCaF(double celcius) {
		return (celcius * 1.8)+32;
	}

}
