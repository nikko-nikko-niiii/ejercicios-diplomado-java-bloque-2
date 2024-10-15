package diplomadojavaSpring.clase1_bloque2;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// revisa si una cadena es palindromo(ignorando espacios y mayusculas)

		String cadena = "A luna ese anule";

		if(palindromo(cadena)) {
			System.out.println("es palindromo");
		}else {
			System.out.println("no es palindromo");
		}
		
	}
	
	private static boolean palindromo(String cadena) {
		
		String cadenaSinEspacios = cadena.replaceAll("\\s+", "");
		String cadenaSinEspaciosRev = "";
		
		for(int i = cadenaSinEspacios.length()-1; i>=0; i--) {
			cadenaSinEspaciosRev += cadenaSinEspacios.charAt(i);
		}
		
//		System.out.println(cadenaSinEspacios);
//		System.out.println(cadenaSinEspaciosRev);
		
		return cadenaSinEspacios.equalsIgnoreCase(cadenaSinEspaciosRev);
	}

}
