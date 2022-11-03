package lezione6Adecco;

import java.util.Scanner;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("> Fornisci stringa");
		String input = scan.nextLine();
		boolean isVocalePresente = true;

		for (int i = 0; i < input.length(); i += 2) {

			char lettera = input.charAt(i);

			if (!(lettera == 'a' ||
				  lettera == 'e' ||
				  lettera == 'u' ||
				  lettera == 'i' ||
					lettera == 'o')) 
				isVocalePresente = false;
			}
			System.out.println(isVocalePresente);
		}

	}


