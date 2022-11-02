package lezione4Adecco;

import java.util.Scanner;

public class Fcuktoriale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println(">Piazza un numero");
		int input = scan.nextInt();
		scan.close();

		double risultato = 1;
		System.out.print("Fattoriale= ");

		input = Math.abs(input);
		// Step stampati
		for (int i = 1; i <= input; i++) {

			if (i == input) {
				System.out.print(i + " = ");
				break;
			}
			System.out.print(i + "*");
		}

		// Calcoli
		if (input > 19 && input != 0) {
			risultato = Math.sqrt(2 * Math.PI * input) * Math.pow(risultato / Math.E, input);

		} else {
			for (int i = 1; i <= input; i++) {
				risultato *= i;
			}
		}
		System.out.print(risultato);
	}

}
