package lezione5Adecco;

import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
	
		// primo modo
		for (int i = 0; i < input.length(); i++) {
			char lettera = input.charAt(i);
		
			if (i%2==0)
				System.out.print(lettera);
		}
		System.out.println("\n###########");
		// secondo modo
		for (int i = 0; i < input.length(); i+=2) {
			char lettera2 = input.charAt(i);
			
			System.out.print(lettera2);
			
		}
	
	}
}
