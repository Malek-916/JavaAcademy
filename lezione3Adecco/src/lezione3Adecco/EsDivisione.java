package lezione3Adecco;

import java.util.Scanner;

public class EsDivisione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("piazza due numeri:");
		
		int inputPrimoNumero = scan.nextInt();
		int inputSecondoNumero = scan.nextInt();
		scan.close();
		
		String risposta = inputPrimoNumero%inputSecondoNumero==0? "yes divisibile":"no divisibile";
		System.out.println(risposta);
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
