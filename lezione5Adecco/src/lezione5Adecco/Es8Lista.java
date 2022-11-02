package lezione5Adecco;
import java.util.Scanner;
public class Es8Lista {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int somma = 0;
		for (int i = 0; i < 5; i++ ) {
			int input = scan.nextInt();
			if (input%2==0) 
				somma+=input;
		}
		System.out.println(somma);
		
		
		
	}
}
