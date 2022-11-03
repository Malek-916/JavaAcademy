package lezione7Adecco;

import java.util.*;

public class roulette {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		boolean isGameOn = true;
		int cash = 100;
		
		while (isGameOn && cash > 0) {
			System.out.print("Quanto vuoi giocare? $" + cash + "\n>> ");
			int puntata = scan.nextInt();
			// semaforo scomessa minore soldi disponibili
			while (puntata > cash || puntata <= 0) {
				System.err.println("non va bene");
				System.out.print("Quanto vuoi giocare?"+ "\n>> ");
				puntata = scan.nextInt();
			}
			
			cash -= puntata;
			
			System.out.print("Piazza una puntata tra 0 e 10" + "\n>> ");
			int numeroUtente = scan.nextInt();
			// scelta numero da giocare
			while (numeroUtente < 0 || numeroUtente > 10) {
				System.out.print("TRA O E 10 !!" + "\n>> ");
				 numeroUtente = scan.nextInt();
			}
			
			int numeroEstratto = random.nextInt(0, 11);
			System.out.println("Il numero estratto ===> " + numeroEstratto);
			
			if (numeroEstratto == numeroUtente) {
				System.out.println("hai vinto");
				cash += puntata *3;
			} else {
				System.out.println("non hai vinto");
			}
			
			
			System.out.print("Vuoi giocare ancora?" + "\n>> ");
			isGameOn = scan.next().equals("yes") ? true : false;
		}
	}
}
