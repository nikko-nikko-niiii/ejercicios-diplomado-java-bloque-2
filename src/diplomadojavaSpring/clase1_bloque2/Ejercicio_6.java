package diplomadojavaSpring.clase1_bloque2;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// espero poder recordar como se hacia el factorial que disminuye los calculos a la mitad(creo), odio el metodo primitivo
		
		
		int numero = 9;
		double resultado = 1;
		
		for(int cnt = 1; cnt <= numero; cnt++) {
			resultado *= cnt;
		}
		
		System.out.println(resultado);

	}

}
