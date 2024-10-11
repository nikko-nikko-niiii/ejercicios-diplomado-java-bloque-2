package diplomadojavaSpring.clase1_bloque1;

import java.util.Iterator;

public class Ejercicio_4 {

	public static void main(String[] args) {
		/**
		 * promedios aritmetico y armonico 
		 */
		
		int[] valores = {12, 13, 14, 15, 17};

		double promedioAritmetico = 0;
		double promedioArmonico = 0;
		
		//System.out.println(valores.length);
		
		
		//aritmetico
		for(int i = 0; i<valores.length; i++) {
			promedioAritmetico += valores[i];  
		}
		promedioAritmetico /=valores.length;
		
		System.out.println("Promedio aritmetico: " + promedioAritmetico);
		
		
		//armonico
		for(int i = 0; i<valores.length; i++) {
			double mientras = valores[i];
			promedioArmonico +=  1/mientras;
		}
		promedioArmonico =valores.length/promedioArmonico;
		
		System.out.println("Promedio armonico: " + promedioArmonico);
		
		
		
		
	}
}
