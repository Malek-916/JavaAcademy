package lezione3Adecco;

import java.util.Scanner;

public class EsOperatoriLogici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Caccia un numero:");

		int input = scan.nextInt();

		String ris = input % 2 == 0 ? "pari" : "Dispari";
		System.out.println(ris);

	}

}
