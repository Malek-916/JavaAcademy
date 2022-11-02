package lezione3Adecco;

import java.util.Scanner;

public class EsMetodoSexyDiConfronto{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Inserisci 1' numero: ");
		int input1 = scan.nextInt();
		System.out.print("Inserisci 2' numero: ");
		int input2 = scan.nextInt();
		System.out.print("Inserisci 3' numero: ");
		int input3 = scan.nextInt();
		
		scan.close();

		String risposta = input1 == input2 && input2 == input3 ? "Uguali" : "Diversi";
		System.out.println(risposta);
		
	}
}
