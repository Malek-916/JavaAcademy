package lezione5Adecco;
import java.util.Scanner;
public class Es12Lista {
	
//	 *  12 . data una serie di numeri che termina con il valore
//	 *       -1 , trovare il valore piu' grande della sequenza
//	 *       
//	 *    Es : 10 2 88 9 77 -1 ------> stampo 88   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int bigG = 0;
		int input = 1;
		while (input>0) {
			System.out.println("num: ");
			input = scan.nextInt();
			if (input > bigG ) 
				bigG = input;

		}

		System.out.println(bigG);
	}

}
