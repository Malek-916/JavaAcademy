package lezione3Adecco;

import java.util.Scanner;

public class EsDiQualcosa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("caccia 3 numeri: ");
		int primoNumero = scan.nextInt();
		int seccondoNumero = scan.nextInt();
		int terzoNumero = scan.nextInt();
		
		
		String merda = primoNumero%5==0 && seccondoNumero%5==0 && terzoNumero%5==0 ? "bene ":"male";
		System.out.println(merda);
		
		

	}

}
