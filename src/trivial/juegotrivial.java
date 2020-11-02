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

		int acierto = 0, fallo = 0, puntos = 0, num, total = 0;

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
				"Pregunta Nº 4 - De estas cuatro listas, cuales fueron los modelos con configuración de motor rotativo (WANKEL)."
						+ "\n1- \n -Ford Mustang FastBack 289. \n -Mercedes-Benz 280e W114. \n -Lotus Excel Coupe. \n -Daihatsu Feroza. \n -Chevrolet Silverado 2500. "

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
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Pregunta Nº 5 - La nomenclatura del Mercedes-Benz Clase C (1993-1997). " + "\n1- W124. "
				+ "\n2- W221. " + "\n3- W210. " + "\n4- W202. ");
		num = sc5.nextInt();
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
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Pregunta Nº 6 - ¿Cúal ha sido la amyor rivalidad entre coches de tipo Muscle/Pony Cars?. "
				+ "\n1 \n -Mercedes-Benz Clase S \n -BMW Serie 7 \n -Audi A8. "
				+ "\n2 \n -Ford Mustang \n -Chevrolet Camaro \n -Dodge Challenger."
				+ "\n3 \n -Rolls Royce Phantom \n -Bentley Continental \n -Jaguar XJ12. "
				+ "\n4 \n -Lamborghini Miura \n -Ferrari 275 GTB \n -Ford GT40. ");
		num = sc6.nextInt();
		switch (num) {
		case 1:
			System.out.println("La respuesta es correcta :(");
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
			System.out.println("La respuesta es incorrecta :(");
			total -= puntos;
			fallo++;
			break;
		default:
			System.out.println("La opción introducida no es válida, eliga entre 1 y 4. ");
		}
		Scanner sc7 = new Scanner(System.in);
		System.out.println(
				"Pregunta Nº 7 - Cada uno de estos coches es el más emblemático de diferente época, ¿Cúal es el más emblemático de la decada de 1980s?. "
						+ "\n1- Ferrari F40. " + "\n2- Shelby Cobra SC 427. " + "\n3- Porsche 911 Turbo. "
						+ "\n4- Lamborghini Diablo. ");
		num = sc7.nextInt();
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
		Scanner sc8 = new Scanner(System.in);
		System.out.println("Pregunta Nº 8 - El primer modelo de Toyota en ser híbrido es... " + "\n1- Toyota Supra. "
				+ "\n2- Toyota Sephia. " + "\n3- Toyota Prius. " + "\n4- Toyota Starlet. ");
		num = sc8.nextInt();
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
		Scanner sc9 = new Scanner(System.in);
		System.out.println(
				"Pregunta Nº 9 - De los siguientes automóviles, cuál no pertenece al grupo GM (General Motors). "
						+ "\n1- Buick Skyhawk. " + "\n2- Oldsmobile Delta 88. " + "\n3- Chevrolet Monte Carlo. "
						+ "\n4- Mercury Cougar XR-7. ");
		num = sc9.nextInt();
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
			System.out.println("La respuesta es incorrecta :)");
			total += puntos;
			acierto++;
			break;
		default:
			System.out.println("La opción introducida no es válida, eliga entre 1 y 4. ");
		}
		Scanner sc10 = new Scanner(System.in);
		System.out.println(
				"Pregunta Nº 10 - ¿Que timepo estableció el Porsche 917K de Le Mans, en el Circuit de la Sarthe en 1971?, considerada la vuelta más rápida de la historia. "
						+ "\n1- 3:37,1. " + "\n2- 4:42,1. " + "\n3- 4:66,7. " + "\n4- 3:03,9. ");
		num = sc10.nextInt();
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
		int suma = 0;
		suma = (puntos + acierto);

		System.out.println("Enhorabuena, has conseguido " + suma + " puntos");

	}

}
