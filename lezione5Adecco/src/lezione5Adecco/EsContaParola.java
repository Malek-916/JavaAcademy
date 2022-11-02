package lezione5Adecco;

import java.util.Scanner;

public class EsContaParola {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int numVocali = 0;
		
		for (int i = 0; i<input.length();i++) {
			char lettera = input.charAt(i);
			if (lettera == 'a' || lettera == 'e' || lettera == 'u' || lettera == 'i' || lettera == 'o') {
				numVocali++;
			}
		}
		System.out.println(numVocali);
	}
}
