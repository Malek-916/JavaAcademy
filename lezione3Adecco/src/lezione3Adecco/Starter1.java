package lezione3Adecco;

import java.util.Scanner;

public class Starter1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Inserisci eta: ");
		int eta = scan.nextInt();
		scan.close();

		if (eta >= 18) {
			System.out.println("Puoi prendere la patente in Italia.");

		} else {
			System.out.println("Non puoi prendere la patente. (eta minore di 18)");
		}

	}

}
