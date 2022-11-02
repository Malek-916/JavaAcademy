package lezione4Adecco;

import java.util.Scanner;

public class Sommatoria {

	public static void main(String[] args) {

		System.out.println(">>Piazza un numero che ti faccio la sommatoria:");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();

		int somma = 0;

		System.out.print("Sommatoria=");

		// ciclo sommatoria
		for (int i = 1; i <= input; i++) {
			if (i == input) {
				System.out.print(i + "=");
				somma += i;
				break;
			}

			System.out.print(i + "+");
			somma += i;
		}
		System.out.print(somma);
	}

}
