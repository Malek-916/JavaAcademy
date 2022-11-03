package lezione7Adecco;

import java.util.Scanner;

public class EsVettori2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Lunghezza vettore:\n>> ");
		int input = scan.nextInt();
		// condizione lunghezza vettore
		while (input < 3 || input > 10) {
			System.err.print("Lunghezza vettore (<3 >10):\n>> ");
			input = scan.nextInt();
		}
		System.out.println("###################\nNumeri da assegnare:");
		// creazione e riempimento vettore
		int[] vett = new int[input];
		for (int i = 0; i < vett.length; i++) {
			System.out.print("Numero " + (i + 1) + " = >> ");
			vett[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("###################\nIl vettore creato:");
		// stampa vettore
		for (int i = 0; i < vett.length; i++) {
			System.out.print(vett[i] + " ");
		}
		
	}

}
