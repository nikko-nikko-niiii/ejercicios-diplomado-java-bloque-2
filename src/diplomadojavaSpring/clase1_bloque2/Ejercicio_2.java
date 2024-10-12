package diplomadojavaSpring.clase1_bloque2;

public class Ejercicio_2 {

	public static void main(String[] args) {
		//fizz buzz
		
		for (int i = 1; i <= 100; i++) {
			
			if(i%3==0) {
				System.out.print("fizz");
			}
			if(i%5==0){
				System.out.print("buzz");
			}
			if((i%3!=0)&&(i%5!=0)){
				System.out.print(i);
			}

			System.out.print("\n");
		}
				

	}

}
