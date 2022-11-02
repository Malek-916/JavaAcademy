package lezione5Adecco;
import java.util.Scanner;


public class Es7Lista {
//	 *  7.Chiedere all'utente di inserire 5 numeri e fare la
//	 *    somma. ( usare i ciclo )
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int somma = 0;
		
		for (int i = 0; i<5; i++) {
			int input = scan.nextInt();
			somma += input;
		}
		System.out.println(somma);
	}

}
