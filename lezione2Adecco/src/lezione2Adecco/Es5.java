package lezione2Adecco;

import java.util.Scanner;

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(">Scrivi minuti per convertire in secondi: ");
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		System.out.println(input + " min sono " + input*60 + " secondi");
		

	}

}
