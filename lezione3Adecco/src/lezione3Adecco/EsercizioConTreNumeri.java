package lezione3Adecco;

import java.util.Scanner;

public class EsercizioConTreNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Caccia 3 numeri:");
		
		int primoNum, numCompreso, terzoNum;
		primoNum = scan.nextInt();
		numCompreso = scan.nextInt();
		terzoNum = scan.nextInt();
		
		if (numCompreso > terzoNum || numCompreso < primoNum) 
			System.out.println("il numero non e compreso");
		 else 
				System.out.println("OK!");

		}

}
