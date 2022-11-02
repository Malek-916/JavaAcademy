package lezione2Adecco;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String i1 = scan.nextLine();
		String i2 = scan.nextLine();

		scan.close();
		System.out.println("");

		if (i1.length() >= i2.length()) {
			System.out.println(i1);
		} else {
			System.out.println(i2);
		}
	}
}
