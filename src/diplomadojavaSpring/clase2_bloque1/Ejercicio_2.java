package diplomadojavaSpring.clase2_bloque1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// promedio de un arreglo de enteros
		
		
		System.out.println("Ingrese largo del arreglo:");
		Scanner scanner = new Scanner(System.in);
		
		int largo = scanner.nextInt();
		
		int[] nombre = new int[largo];
		int acum = 0;
		
		for(int i =0; i < largo; i++) {
			Random aleatorio = new Random();
			nombre[i] = aleatorio.nextInt();
			System.out.println(nombre[i] + ", ");
			acum += nombre[i];
		}
		
		double prom = acum/largo;
		

		System.out.printf("promedio:%.0f\n", prom);
		System.out.println("promedio: " + prom);
		
		
		
	}

}
