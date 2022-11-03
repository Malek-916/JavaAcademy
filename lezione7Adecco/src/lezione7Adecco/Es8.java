package lezione7Adecco;

import java.util.Random;
import java.util.Scanner;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] vett = new int[5];

		// creazione vettore randomizzato
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(0, 101);
			System.out.print(vett[i] + " ");
		}
		System.out.println("");
		
		System.out.print(">Inserisci a number: ");
		int input = scan.nextInt();
		System.out.print(">I multipli sono: ");
		
		for (int i = 0; i < vett.length; i++) {
			if (vett[i]%input==0) 
				System.out.print(vett[i] + " ");
				
			
		}
	}
}
