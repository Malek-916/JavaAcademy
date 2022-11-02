package lezione3Adecco;

import java.util.Scanner;

public class EsCondizioni1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Inserisci primo numero: ");
		int input1 = scan.nextInt();
		System.out.print("Inserisci Secondo numero: ");
		int input2 = scan.nextInt();

//		if (input1 == input2) {
//			System.out.println("uguali");
//		} else {
//			System.out.println("diversi");
//		}
		
		
		String risposta = input1 == input2 ? "Sono uguali" : "Sono diversi";
	
		System.out.println(risposta);
	
	
	}
}
