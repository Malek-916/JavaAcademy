package lezione8Adecco;

import java.util.Scanner;

public class Es3v2 {
//	*    la versione 2 parte da un vettore
//	 *    di stringhe {"mario" , "luigi" , "ciro" }
//	 *    
//	 *    e un nome in input ( Scanner )
//	 *    
//	 *    il programma stampa si se il nome 
//	 *    è presente del vettore 
//	 *    
//	 *    attenzione ( per le stringhe si usa equals )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String[] vettore = {"mario", "blabla", "true"};
		
		System.out.print("inserisci: ");
		String input = scan.nextLine();
		boolean presenteIlNumero = false;
		
		for (int i = 0; i < vettore.length; i++) {
			if (vettore[i].contains(input)) {
				presenteIlNumero = true;
				break;
			}
		}
		System.out.println(presenteIlNumero);
		
		
		
		
		
	}


}
