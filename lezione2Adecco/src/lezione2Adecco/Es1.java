package lezione2Adecco;

import java.util.Scanner;

public class Es1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Scrivi qualcosa e premi invio: ");
		String stringaNumeroUno = scan.nextLine();
		System.out.print("di nuovo: ");
		String stringaNumerodue = scan.nextLine();

		scan.close();

		System.out.println("\n" + stringaNumeroUno + " lunghezza: " + stringaNumeroUno.length() + "\n"
				+ stringaNumerodue + " lunghezza: " + stringaNumerodue.length());

		System.out.println("Primo carattere di " + stringaNumeroUno + ": " + stringaNumeroUno.charAt(0) + "\n"
				+ "Primo carattere di " + stringaNumerodue + ": " + stringaNumerodue.charAt(0));

		System.out.println(
				"Entrambe in Maisculo:\n" + stringaNumeroUno.toUpperCase() + "----" + stringaNumerodue.toUpperCase());

	}
}
