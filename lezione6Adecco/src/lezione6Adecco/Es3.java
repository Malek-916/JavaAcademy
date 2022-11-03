package lezione6Adecco;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int somma = 0;

		for (int index = 0; index < input.length(); index++) {
			char num = input.charAt(index);
			somma += Integer.parseInt(num + "");
		}
		scan.close();
		String ris = somma % 3 == 0 ? "ok è multiplo" : "no multiplo";
		System.err.println(ris);

	}
}
