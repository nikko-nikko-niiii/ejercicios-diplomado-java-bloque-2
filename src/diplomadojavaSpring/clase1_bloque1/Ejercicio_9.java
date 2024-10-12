package diplomadojavaSpring.clase1_bloque1;

public class Ejercicio_9 {

	public static void main(String[] args) {
		/**
		 * convierte segundos en horas y minutos
		 * probablemente existen mejores formas de hacerlo, sobre todo la conversion de horas y minutos pero a esta hora ya no me quier esforzar tanto y ponerme a buscar como diantres se usa el pad para ponerle ceritos a los valores  
		 */

		int segundos = 456789;

		//minutos totales por le momento
		int minutos = Math.floorDiv(segundos, 60);

		//horas
		int horas = Math.floorDiv(minutos, 60);

		//elimino horas de los minutos en minutos
		minutos = minutos - (horas*60);

		//elimino horas de los segundos en segundos
		segundos = segundos - (horas*60*60)-(minutos*60);

		String Shoras = "";
		String Sminutos ="";
		String Ssegundos ="";

		if(horas<10 && horas>0) {
			Shoras = "0"+horas;
		}else if(horas==0) {
			Shoras ="00";
		}else {
			Shoras = String.valueOf(horas);
		}

		if(minutos<10 && minutos>0) {
			Sminutos = "0"+minutos;
		}else if(minutos==0) {
			Sminutos ="00";
		}else {
			Sminutos = String.valueOf(minutos);
		}

		if(segundos<10 && segundos>0) {
			Ssegundos = "0"+segundos;
		}else if(segundos==0) {
			Ssegundos ="00";
		}else {
			Ssegundos = String.valueOf(segundos);
		}

		System.out.println(horas + ":"+ minutos+":"+segundos);
		System.out.println(Shoras + ":"+ Sminutos+":"+Ssegundos);
	}
	
	
	
	/**
	 * CALCULA HORAS MINUTOS Y SEGUNDOS A PARTIR DE SEGUNDOS
	 * @param segundos
	 * @return
	 */
	public static String calculaHorasDesdeSegundos(int segundos) {

		//minutos totales por le momento
		int minutos = Math.floorDiv(segundos, 60);

		//horas
		int horas = Math.floorDiv(minutos, 60);

		//elimino horas de los minutos en minutos
		minutos = minutos - (horas*60);

		//elimino horas de los segundos en segundos
		segundos = segundos - (horas*60*60)-(minutos*60);

		String Shoras = "";
		String Sminutos ="";
		String Ssegundos ="";

		if(horas<10 && horas>0) {
			Shoras = "0"+horas;
		}else if(horas==0) {
			Shoras ="00";
		}else {
			Shoras = String.valueOf(horas);
		}

		if(minutos<10 && minutos>0) {
			Sminutos = "0"+minutos;
		}else if(minutos==0) {
			Sminutos ="00";
		}else {
			Sminutos = String.valueOf(minutos);
		}

		if(segundos<10 && segundos>0) {
			Ssegundos = "0"+segundos;
		}else if(segundos==0) {
			Ssegundos ="00";
		}else {
			Ssegundos = String.valueOf(segundos);
		}
		
		return Shoras + ":"+ Sminutos+":"+Ssegundos;
	}

}
