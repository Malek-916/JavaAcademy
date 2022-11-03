package lezione6Adecco;

import java.util.*;

public class Es1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int pari = 0;

//		while (num != -1) {
//			System.out.println(">> Inserisci un numero e ti conto i pari\n -1 per uscire");
//			num = scan.nextInt();
//			if (num%2==0) {
//				pari++;
//			}
//		}

		do {
			System.out.println("> Inserisci un numero e ti conto i pari\n> -1 per uscire");
			num = scan.nextInt();
//			pari = num % 2 == 0 ? pari++ : pari;
			if (num % 2 == 0)
				pari++;
		} while (num != -1);
		System.out.println("Numeri pari: " + pari);

	}
}
