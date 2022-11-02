package lezione5Adecco;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String primaParola = scan.nextLine();
		String secondaParolda = scan.nextLine();
		scan.close();

		if (primaParola.length() != secondaParolda.length()) {
			System.err.println("Lunghezze diverse!!");
			System.exit(0);
		}

		for (int i = 0; i < primaParola.length(); i++) {
			System.out.print(primaParola.charAt(i));
			System.out.print(secondaParolda.charAt(i + 1));
			i++;
		}

//		System.out.println();
//		int index = 0;
//		while (index < primaParola.length()) {
//			System.out.print(primaParola.charAt(index));
//			System.out.print(secondaParolda.charAt(index + 1));
//			index += 2;
//		}

	}

}
