package lezione6Adecco;

import java.util.Scanner;

public class Es4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("inserisci");
		int input = scan.nextInt();;
		
		int i = 0;
		int somma = 0;
		
		while (input != 0) {
			System.out.println("inserisci");
			i++;
			somma += input;
			input = scan.nextInt();
		}
		scan.close();
		
//		System.out.println(i);
//		System.out.println(somma);

		System.out.println("> media: " + 1.0 * somma / i);
		
		
		
		
	}
}
