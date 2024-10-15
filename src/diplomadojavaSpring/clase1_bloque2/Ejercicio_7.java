package diplomadojavaSpring.clase1_bloque2;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// imrpime fibonacci

		int limite = 45;
		
		for(int i = 0 ; i < limite; i++) {
			System.out.printf("%d: %.0f\n",i, fibonacci(i));
		}
		
	}

	private static double fibonacci(double x) {
		if (x<2) {
			return x;
		}else {
			return fibonacci(x-1) + fibonacci(x-2);
		}
	}
}
