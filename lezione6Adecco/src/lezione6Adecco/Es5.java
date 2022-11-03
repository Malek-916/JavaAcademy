package lezione6Adecco;

import java.util.Scanner;

public class Es5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean isSquenceOk = true;
		int i = 0;

		System.out.println("> inserisci");
		int input = scan.nextInt();;
		
		while (input != 0) {
			
			if (i % 2 == 0) {
				if (input % 2 != 0)
					isSquenceOk = false;
				
			} else {
				if (input % 2 == 0)
					isSquenceOk = false;
			}
			i++;
			System.out.println("> inserisci");

			input = scan.nextInt();

		}
		System.out.println(isSquenceOk);
	}
}
