package lezione7Adecco;

import java.util.Random;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		int[] vett = new int[10];

		// creazione vettore randomizzato
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(0, 101);
			System.out.print(vett[i] + " ");
		}

		System.out.println("");
		
		for (int i = vett.length - 1; i >= 0; i--) {
			System.out.print(vett[i] + " ");
		}
	}

}
