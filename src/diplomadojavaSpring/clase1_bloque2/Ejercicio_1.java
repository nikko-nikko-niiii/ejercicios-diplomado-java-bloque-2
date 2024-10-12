package diplomadojavaSpring.clase1_bloque2;

public class Ejercicio_1 {

	public static void main(String[] args) {
		/**
		 * llama a las funciones de los ejercicios del bloque 1
		 */

		
		System.out.println("############################################");
		System.out.println("# EJERCICIO 1: AREA Y PERIMETRO RECTANGULO #");
		System.out.println("############################################");
		
		//ejercicio 1
		double lado1 = 1;
		double lado2 = 2;
		

		System.out.println("lado 1: " + lado1);
		System.out.println("lado 2: " + lado2);
		
		double areaCuadrilatero = diplomadojavaSpring.clase1_bloque1.Ejercicio_1.areaRectangulo(lado1, lado2);
		double perimetroCuadrilatero = diplomadojavaSpring.clase1_bloque1.Ejercicio_1.perimetroRectangulo(lado1, lado2);

		System.out.println("area cuadrilatero: " + areaCuadrilatero);
		System.out.println("perimetro cuadrilatero: " + perimetroCuadrilatero);
		
		
		
		System.out.println();
		System.out.println("#########################################");
		System.out.println("# EJERCICIO 2: AREA Y PERIMETRO CIRCULO #");
		System.out.println("#########################################");
		//ejercicio 2
		
		double radio = 5;
		
		double areaCirculo = diplomadojavaSpring.clase1_bloque1.Ejercicio_2.areaCirculo(radio);
		double perimetroCirculo = diplomadojavaSpring.clase1_bloque1.Ejercicio_2.perimetroCirculo(radio);
		
		System.out.println("radio: " + radio);
		System.out.println("area circulo: " + areaCirculo);
		System.out.println("perimetro circulo: " + perimetroCirculo);
		

		System.out.println();
		System.out.println("##############################################");
		System.out.println("# EJERCICIO 3: AREA Y VOLUMEN DE UN CILINDRO #");
		System.out.println("##############################################");
		//ejercicio 3
		

		double radio2 = 5;
		double alto2 = 10;
		
		double areaCilindro = diplomadojavaSpring.clase1_bloque1.Ejercicio_3.areaCilinro(alto2, radio2);
		double volumen = diplomadojavaSpring.clase1_bloque1.Ejercicio_3.volumenCilinro(alto2, radio2);
		

		System.out.println("radio: " + radio2);
		System.out.println("alto: " + alto2);
		System.out.println("Area cilindro: " + areaCilindro);
		System.out.println("Volumen cilindro: " + volumen);
		
		
		
		//ejercicio 4
		System.out.println();
		System.out.println("##################################################");
		System.out.println("# EJERCICIO 4: PROMEDIOS ARITMETICOS Y ARMONICOS #");
		System.out.println("##################################################");

		int[] valores = {12, 13, 14, 15, 17};

		double aritmetico = diplomadojavaSpring.clase1_bloque1.Ejercicio_4.promedioAritmetico(valores);
		double armonico = diplomadojavaSpring.clase1_bloque1.Ejercicio_4.promedioArmonico(valores);

		System.out.print("valores: ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i]);
			if(i+1<valores.length) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
		System.out.println("Promedio aritmetico: " + aritmetico);
		System.out.println("Promedio armonico: " + armonico);
		
		
		
		//ejercicio 5
		System.out.println();
		System.out.println("##################################################");
		System.out.println("# EJERCICIO 5: CALCULA MILLAS A PARTIR DE METROS #");
		System.out.println("##################################################");
		
		int metros = 1600;
		
		double millas = diplomadojavaSpring.clase1_bloque1.Ejercicio_5.convierteMetrosAmillas(metros);

		System.out.println("metros: " + metros);
		System.out.println("millas: " + millas);
		
		
		
		//ejercicio 6
		System.out.println();
		System.out.println("####################################################");
		System.out.println("# EJERCICIO 6: CALCULA FARENHEIT A BASE DE CELCIUS #");
		System.out.println("####################################################");
		
		int celcius = 40;
			
		double far = diplomadojavaSpring.clase1_bloque1.Ejercicio_6.convierteCaF(celcius);

		System.out.println("c°: " + celcius);
		System.out.println("F°: " + far);
		
		
		//ejercicio 7
		System.out.println();
		System.out.println("#############################################");
		System.out.println("# EJERCICIO 7: CALCULA DISTANCIA EUCLIDIANA #");
		System.out.println("#############################################");

		double lat1 = -33.13960018722044, lon1 = -70.07519971686143, lat2 = -33.2382804087118, lon2 = -71.67765056816161;

		double distancia = diplomadojavaSpring.clase1_bloque1.Ejercicio_7.calculaDistanciaEuclidiana(lat1, lon1, lat2, lon2);

		System.out.println("lat1: " + lat1);
		System.out.println("lon1: " + lon1);
		System.out.println("lat2: " + lat2);
		System.out.println("lon2: " + lon2);
		System.out.println("distancia:" + distancia);
		

		
		//ejercicio 8
		System.out.println();
		System.out.println("############################################");
		System.out.println("# EJERCICIO 8: CALCULA DISTANCIA GEODESICA #");
		System.out.println("############################################");
		

		double distanciaGeo = diplomadojavaSpring.clase1_bloque1.Ejercicio_8.calculaDistanciaGeodesica(lat1, lon1, lat2, lon2);

		System.out.println("lat1: " + lat1);
		System.out.println("lon1: " + lon1);
		System.out.println("lat2: " + lat2);
		System.out.println("lon2: " + lon2);
		System.out.println("distancia: " + distanciaGeo);
		
		
		//ejercicio 9
		System.out.println();
		System.out.println("#############################################");
		System.out.println("# EJERCICIO 9: CALCULA HORAS DESDE SEGUNDOS #");
		System.out.println("#############################################");
		
		int segundos = 23176;
		String horas = diplomadojavaSpring.clase1_bloque1.Ejercicio_9.calculaHorasDesdeSegundos(segundos);

		System.out.println("segundos: " + segundos);
		System.out.println("horas: " + horas);
		
		
		
		
		
		//ejercicio 10
		System.out.println();
		System.out.println("######################################################");
		System.out.println("# EJERCICIO 10: CALCULA EERGIA CINETICA DE UN OBJETO #");
		System.out.println("######################################################");

		float masa = 10;
		float velocidad = 10;
		double energia = diplomadojavaSpring.clase1_bloque1.Ejercicio_10.calculaEnergiaCinetica(masa, velocidad);

		System.out.println("masa: " + masa);
		System.out.println("velocidad: " + velocidad);
		System.out.println("energia: " + energia);
				
		
	}

}
