package lezione7Adecco;

import java.util.*;

public class Es5 {

	public static void main(String[] args) {
		
		Random random = new Random();

		int[] vett = new int[4];
		
		// creazione vettore randomizzato
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(0, 101);
			System.out.print(vett[i] + " ");
		}
		
		int max = vett[0];
		int min = vett[0];
		
		// trovo i min e max nel vettore
		for (int i = 0; i < vett.length; i++) {
			if (vett[i] > max) {
				max = vett[i];
			}
			if (vett[i] < min) {
				min = vett[i];
			}
		}
		
		System.err.println("\nNumero piu grande: " + max);
		System.err.println("Numero piu piccolo: " + min);
	}
}
