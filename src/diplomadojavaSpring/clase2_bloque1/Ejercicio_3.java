package diplomadojavaSpring.clase2_bloque1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		//mayor valor de un arreglo de enteros
		

		System.out.println("Ingrese largo del arreglo:");
		Scanner scanner = new Scanner(System.in);
		
		int largo = scanner.nextInt();
		
		int[] nombre = new int[largo];
		
		
		int mayor = 0;
		
		for(int i =0; i < largo; i++) {
			Random aleatorio = new Random();
			nombre[i] = aleatorio.nextInt();
			System.out.println(nombre[i] + ", ");
			
			if(i == 0 ) {
				mayor = nombre[i];
			}
			if(mayor < nombre[i]) {
				mayor = nombre[i];
			}
		}
		
		System.out.println("Mayor:" + mayor);
		

	}

}
