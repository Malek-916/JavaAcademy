package lezione3Adecco;

import java.util.Scanner;

public class EsVotoNumerico {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">Scrivi voto (vigola',')");
		double voto = scan.nextDouble();
		
		// Confrontation
		if (voto <= 4) {
			System.out.println("sei messo malissimo!!");
		} else if (voto <= 6){
			System.out.println("sei messo cosi cosi!!");
		} else {
			System.out.println("sei messo bene!!");
		}
	}
}
