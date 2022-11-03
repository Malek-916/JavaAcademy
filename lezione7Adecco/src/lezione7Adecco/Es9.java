package lezione7Adecco;

import java.util.Random;


public class Es9 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		boolean[] vett = new boolean[5];

		// creazione vettore randomizzato
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextBoolean();
			System.out.print(vett[i] + " ");
		}
		System.out.println("");
		
		int veri = 0;
		
		for (int i = 0; i < vett.length; i++) {
			if (vett[i] == true) {
				veri++;
			}
		}
		System.err.println("True: " + veri + "\nFalse: " + (vett.length-veri));	
	}
}
