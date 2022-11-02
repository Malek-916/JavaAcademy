package lezione4Adecco;

import java.util.Scanner;

public class FormulaDiBob {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		scan.close();
		System.out.println(">> Inserisci numero maggiore 1:");

		if (input >= 1) {
			double primoBlocco = (2 * Math.E * Math.PI) / 7;
			double secondnoBlocco = Math.sqrt(5 * Math.PI);

			double formulaDiBob = (primoBlocco + secondnoBlocco + input) / (9 * Math.E);

			System.out.println("Risultato: " + formulaDiBob);
		} else {
			System.out.println("Il numero < 1 riprova");
			// System.exit(0);
		}

	}

}
