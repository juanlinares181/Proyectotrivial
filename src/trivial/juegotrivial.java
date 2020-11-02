package trivial;

import java.util.Scanner;

public class juegotrivial {

	public static void main(String[] args) {

		System.out.println("\n888888888888              88               88              88  \r\n"
				+ "    88                   \"\"               \"\"              88  \r\n"
				+ "    88                                                    88  \r\n"
				+ "    88       8b,dPPYba,  88  8b       d8  88  ,adPPYYba,  88  \r\n"
				+ "    88       88P'   \"Y8  88  `8b     d8'  88  \"\"     `Y8  88  \r\n"
				+ "    88       88          88   `8b   d8'   88  ,adPPPPP88  88  \r\n"
				+ "    88       88          88    `8b,d8'    88  88,    ,88  88  \r\n"
				+ "    88       88          88      \"8\"      88  `\"8bbdP\"Y8  88 ");

		int acierto = 0, fallo = 0, puntos = 10, num, total = 0;

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Tema: Vehículos ");
		System.out.println("Pregunta Nº 1 - ¿Cómo se llamaba originalmente la marca Subaru? "
				+ "\n1- Osaka Heavy Industries. " + "\n2- Motegi Heavy Industries. " + "\n3- Fuji Heavy Industries. "
				+ "\n4- Huyioara Heavy Industries. ");
		num = sc1.nextInt();

		switch (num) {
		case 1:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 2:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 3:
			System.out.println("La respuesta es correcta :)");
			total += puntos;
			acierto++;
			break;
		case 4:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		default:
			System.out.println("La opción introducida no es válida, eliga entre 1 y 4. ");
		}

		Scanner sc2 = new Scanner(System.in);
		System.out
				.println("Pregunta Nº 2 - ¿Cúal fue el primer vehículo de producción en montar un bloque de motor V16? "
						+ "\n1- Cord-29 (1929). " + "\n2- Bugatti Type 41 Royale (1931). "
						+ "\n3- Duesenberg Model SJ (1936). " + "\n4- Cadillac Model Series (1930). ");
		num = sc2.nextInt();
		switch (num) {
		case 1:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 2:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 3:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 4:
			System.out.println("La respuesta es correcta :)");
			total += puntos;
			acierto++;
			break;
		default:
			System.out.println("La opción introducida no es válida, eliga entre 1 y 4. ");
		}

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Pregunta Nº 3 - La velocidad máxima que alcanzo el Bugatti Veyron de 2005 (en KmH). "
				+ "\n1- 407 KmH. " + "\n2- 387 KmH. " + "\n3- 500 KmH. " + "\n4- 391 KmH. ");
		num = sc3.nextInt();
		switch (num) {
		case 1:
			System.out.println("La respuesta es correcta :)");
			total += puntos;
			acierto++;
			break;
		case 2:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 3:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 4:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		default:
			System.out.println("La opción introducida no es válida, eliga entre 1 y 4. ");
		}
		Scanner sc4 = new Scanner(System.in);
		System.out.println(
				"Pregunta Nº 4 - De estas cuatro listas, cuales fueron los modelos con configuracción de motor rotativo (WANKEL)."
						+ "\n1- \n -Ford Mustang FastBack 289. \n -Mercedes-Benz 280e W114. \n -Lotus Excel Coupe. \n D-aihatsu Feroza. \n -Chevrolet Silverado 2500. "

						+ "\n2- \n -Mazda Luce R130. \n -Citroën GS Bimotor. \n -NSU Ro80. \n -Chevrolet Aerovette Concept. \n -Audi A1 E-tron."

						+ "\n3- \n -Mercury Grand Marquis. \n -Riley RM Saloon. \n -Renault Avanttime. \n -Maserati Ghibli Spyder. \n -BMW 3200 Coupe. "

						+ "\n4- \n -Nissan Sunny Coupe. \n -Peugeot 405 Gti. \n -Datsun Bluebird 710. \n -Lamborghini Silhouette. \n -Buick Limited. ");

		num = sc4.nextInt();
		switch (num) {
		case 1:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 2:
			System.out.println("La respuesta es correcta :)");
			total += puntos;
			acierto++;
			break;
		case 3:
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		case 4:
			System.out.println("La respuesta es correcta :)");
			total -= puntos;
			fallo++;
			break;
		default:
			System.out.println("La opción introducida no es válida, eliga entre 1 y 4. ");
		}
	}

}
