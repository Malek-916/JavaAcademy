package lezione4Adecco;

import java.util.Scanner;

public class EsCicli2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// primo < secondo per scontato
		System.out.println("piazza un numero:");
		int primoNum = scan.nextInt();
		System.out.println("piazza un altro piu grande:");
		int secondoNum = scan.nextInt();
		scan.close();

//		if (primoNum > secondoNum);
//			int bitch = primoNum;
//			primoNum = secondoNum;
//			secondoNum = bitch;
//			
//			
		int max = primoNum > secondoNum ? primoNum : secondoNum;
		int min = primoNum > secondoNum ? secondoNum : primoNum;

		while (min <= max) {
			System.out.println(min+ " ");
			min++;
		}
		
		
		
//		for (int i = primoNum;i<=secondoNum;i++) {
//			System.out.println(i + " ");
//		}

	}

}
