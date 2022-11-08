package lezione9Adecco;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

    	System.out.print("titolo:\n> ");
		String titolo = scan.nextLine();

		System.out.print("genere:\n> ");
		String genere = scan.nextLine();

		System.out.print("duarta: (##,##min)\n> ");
		double durata = scan.nextDouble();

		System.out.print("se va bene a tutti -->y\n> ");
		String rating = scan.next();

		Dvd dvd = new Dvd();
		Dvd dvd2 = new Dvd(titolo, genere, durata, rating.equals("y"));

		scan.close();

		System.err.println("---------------\n" + dvd);
		System.err.println("---------------\n" + dvd2);

	}
}
