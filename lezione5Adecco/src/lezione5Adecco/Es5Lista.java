package lezione5Adecco;
import java.util.Scanner;

public class Es5Lista {
//	 *  5.L’utente inserisce un anno ed il calcolatore verifica se è bisestile.
//		Un anno è bisestile se è divisibile per 4 ma non per 100,
//		oppure se è divisibile per 400.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anno = scan.nextInt();
		
		if (anno % 4 == 0 && anno % 100 != 0) {
			System.out.println("anno bouno(4enon100)");
		} else if (anno%400==0) {
			System.out.println("anno buono(400)");
		} else 
			System.out.println("anno di merda");
			
		
		
		
	}
}
