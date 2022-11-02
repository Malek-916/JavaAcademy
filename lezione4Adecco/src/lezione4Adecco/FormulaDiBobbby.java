package lezione4Adecco;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class FormulaDiBobbby {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		scan.close();
		System.out.println(">> Inserisci numero :");

		double primoBlocco = Math.pow(Math.E / 2, input + 1);
		double secondnoBlocco = Math.pow(Math.PI / 4, 3);
		double sotto = (2 * Math.PI) - 7 * input / 3;

		double formulaDiBobby = (primoBlocco * secondnoBlocco) / sotto;

		System.out.println("Risultato: " + formulaDiBobby);

		// System.out.println("Il numero < 1 riprova");
		// System.exit(0);
	}

}
