package lezione5Adecco;

import java.util.Scanner;

public class Es1Lista {
	
//	 * 	1- Scrivere un programma che prenda
//	 *     in ingresso una stringa e 
//	 * 	   stampi a video se la stringa
//	 *     e palindroma.
//	 *     
//	 *     Palindroma : posso leggere la
//	 *     parola da sinistra verso destra
//	 *     oppure da destra verso sinistra.
//	 *     
//	 *     Es : anna --> è palindroma
//	 *          ciao --> non è palindroma  
//	 * 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		scan.close();
		String par = "";
		
		for(int i = input.length()-1; i >=0; i--) {
			char lettera = input.charAt(i);
			 par += lettera; ;
		}
		
		if (input.equals(par))
			System.out.println("ok");
		else 
			System.out.println("no");
		
		
		
		
		
		
		
		
		
	}

}
