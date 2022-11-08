package lezione8Adecco;

import java.util.Scanner;

public class Es3 {
//	 *    Esercizio 3 . 
//	 * 	  Dato un vettore già 
//	 *    inizializzato  { 4 , 8 , 12 }
//	 * 		
//	 *    e un numero in input con Scanner 
//	 *    
//	 *    determinare se il numero inserito
//	 *    e' presente all'interno del vettore
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vettore = {4, 8, 12};
		
		System.out.print("inserisci: ");
		int num = scan.nextInt();
		boolean presenteIlNumero = false;
		
		for (int i = 0; i < vettore.length; i++) {
			if (vettore[i] == num) {
				presenteIlNumero = true;
				break;
			}
		}
		
		System.out.println(presenteIlNumero);
		
		
		
		
		
	}

}
