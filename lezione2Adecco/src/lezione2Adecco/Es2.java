package lezione2Adecco;

import java.util.Scanner;

/*
 *  Creare un programma che prende a tastiera
 * una stringa e un numero intero
 * stampa a video la stringa e i 
 * index possibli.
 * 
 * poi prende un numero intero sempre da tastiera 
 * e stampa a video il carattere alla posizione di
 *  quel numero
 * 
 */



public class Es2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">>> Scrivi qualcosa: ");
		
		String input = scan.nextLine();
		
		System.out.println("Il tuo range da 0 a " + (input.length()-1) + ".\n");
		
		System.out.print(">>> Scrivi un numero: ");
		
		int num = Integer.valueOf(scan.nextLine());
		
		System.out.println("Il tuo indice '" + num + "' equivale alla lettera ---> '" + input.charAt(num) + "'.");
		
		scan.close();
	}

}
