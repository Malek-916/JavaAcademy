package lezione7Adecco;

import java.util.Random;

public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		int[] vett = new int[5];

		// creazione vettore randomizzato
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(0, 11);
			System.out.print(vett[i] + " ");
		}

		System.out.println("");
		int somma = 0;
		for (int i = 0; i < vett.length; i+=2) {
			System.out.print(vett[i] + "   ");
			somma += vett[i];
		}
		System.err.println("\nla somma negli index pari: " + somma);
	}

}
