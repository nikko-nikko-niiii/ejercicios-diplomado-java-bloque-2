package diplomadojavaSpring.clase2_bloque1;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// arreglo con N enteros aleatorios
		
		System.out.println("Ingrese largo del arreglo:");
		Scanner scanner = new Scanner(System.in);
		
		int largo = scanner.nextInt();
		
		int[] nombre = new int[largo];
		
		for(int i =0; i < largo; i++) {
			Random aleatorio = new Random();
			nombre[i] = aleatorio.nextInt();
			System.out.println(nombre[i] + ", ");
		}
		

	}

}
