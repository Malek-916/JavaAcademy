package lezione8Adecco;

import java.util.Scanner;

public class StarterOperazioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funz op = new Funz();
		Scanner scan = new Scanner(System.in);
		
//		System.out.println(op.isNumPari(2));
//		System.out.println(op.isWordStartWithVocal("ala"));
		
//		boolean loopOn = true;
//		do {
//			System.out.println("Inserisci numero: ");
//			int input = scan.nextInt();
//			
//			String ris = op.isNumPari(input) ? "ok pari" : "no dispari";
//			System.out.println(ris+"\ny per continuare");
//			
//			loopOn = scan.next().equals("y") ? true : false;
//			
//		} while (loopOn);
//		
//		scan.close();
		op.christmasTree(4);
	}
}

