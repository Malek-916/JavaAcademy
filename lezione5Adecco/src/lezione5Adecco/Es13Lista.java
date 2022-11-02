package lezione5Adecco;

import java.util.Scanner;

//*  13. trovare la media aritmetica di una sequenza di interi
//*  	che termina con il valore 0
//*  
//*       Es :  10 2 0 ----> la media vale 12

public class Es13Lista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int somma = 0;
		int i = 0;
		int input = 0;

		while (true) {
			input = scan.nextInt();
			if (input == 0)
				break;
			somma += input;
			i++;

		}
//		System.out.println(somma);
//		System.out.println(i);
		System.out.println(1.0 * somma / i);
	}
}
