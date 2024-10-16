package diplomadojavaSpring.clase2_bloque1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// rango de un arreglo de enteros
		
		System.out.println("Ingrese largo del arreglo:");
		Scanner scanner = new Scanner(System.in);
		
		int largo = scanner.nextInt();
		
		int[] nombre = new int[largo];
		
		
		int mayor = 0;
		int menor = 0;
		
		for(int i =0; i < largo; i++) {
			Random aleatorio = new Random();
			nombre[i] = aleatorio.nextInt();
			System.out.println(nombre[i] + ", ");
			
			if(i == 0 ) {
				mayor = nombre[i];
				menor = nombre[i];
			}
			if(mayor < nombre[i]) {
				mayor = nombre[i];
			}
			if(menor > nombre[i]) {
				menor = nombre[i];
			}
		}
		
		int rango = mayor - menor;
		
		System.out.println("Mayor:" + mayor);
		System.out.println("Menor:" + menor);
		System.out.println("Rango:" + rango);

	}

}
