package lezione4Adecco;

import java.util.Scanner;

public class EsStringhe {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String newParola = "";
		scan.close();	
		
		for (int i = 0; i<input.length();i++) {
			
			char lettera = input.charAt(i);
			//System.out.println(lettera);
			// System.out.println(lettera);
			
			if (lettera == 'a' || lettera == 'e' ||
				lettera == 'u' || lettera == 'i' ||
				lettera == 'o') {
				
				newParola += lettera;
				
			}

		}																							
		System.out.println(newParola);
		
		
	}
	

}
