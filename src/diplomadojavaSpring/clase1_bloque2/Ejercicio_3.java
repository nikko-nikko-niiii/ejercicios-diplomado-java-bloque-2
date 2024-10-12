package diplomadojavaSpring.clase1_bloque2;

public class Ejercicio_3 {

	public static void main(String[] args) {
		//numeros primos		
		
		//el 1 no es primo y el 2 no se toma en cuenta
		int inicio = 3;
		
		//fin
		int fin = 100;
		
		//para mantener la cuenta de cuantos primos encontré, parto en uno por que asumo el n°2
		int cnt = 1;
		cnt++;
		
		//imprimo el 2
		System.out.println(cnt +":"+2);
		
		//inicio el bucle, parte desde el inicio que es 3 hasta el limite, avanza de 2 en 2 por que ningun numero par es primo
		for (int i = inicio ; i <= fin ; i+=2) {
			
			//bandera para saber si el n es primo
			Boolean p = true;
			
			//retrocede de 2 en 2 hasta 3 desde el valor actual en el que estoy
			for(int j = i-2 ; j >= 3; j -=2) {
				
				//si se encuentra tan solo una division se marca como no primo y se sale, no creo que sea necesario validar con "p", pero mejor que quede ahi por si las moscas
				if(i%j==0 && p) {
					p=!p;
					break;
				}
				
			}
			
			//si no es marcado como no primo aumenta la cuenta de primos encontrados e imprime los resultados
			if(p) {
				cnt++;
				System.out.println(cnt + ":"+i);
			}
			

			
		}

	}

}
