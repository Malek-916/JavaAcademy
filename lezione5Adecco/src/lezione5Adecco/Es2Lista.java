package lezione5Adecco;

import java.util.Scanner;

public class Es2Lista {
//	2. Data una stringa in input
//	 *     e un numero intero
//	 *     stampare la stringa 
//	 *     tante volte quanto è il numero
//	 *     
//	 *     Es ciao 3
//	 *     
//	 *     ciao ciao ciao
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String myString = scan.nextLine();
		int myInt = scan.nextInt();
		
		for (int i = 0; i < myInt; i++) {
			System.out.println(myString);
		}
		

	}

}
