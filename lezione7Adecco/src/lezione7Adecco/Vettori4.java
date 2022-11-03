package lezione7Adecco;

import java.util.*;

public class Vettori4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		boolean pari = true;
		int[] vett = new int[6];

		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(0, 101);
			System.out.print(vett[i] + " ");
		}

		for (int i = 0; i < vett.length; i++) {
			if (vett[i] % 2 != 0) {
				pari = false;
				break;
			}
		}

		System.out.println("\n" + pari);

	}

}
