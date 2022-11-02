package lezione2Adecco;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(">>insersci due interi: ");
		int num1, num2;

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		
		System.out.println("\nHai scritto i numeri: " + num1 + " e " + num2);
		
		if (num1 > num2 ) {
			System.out.println(num1 + " vince");
		} else {
			System.out.println(num2 + " vince");
		}

	}
}
