package lezione4Adecco;

import java.util.Scanner;

public class EsFunzionePotenza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		int base = scan.nextInt();
		int esp = scan.nextInt();
		scan.close();
		int ris = 1;
		
		
			for (int i = 1;i <= esp; i++) {
				ris *= base;
				
		}
		System.out.println(ris);
		
	
		
		
		
		
		
		
	}

}
