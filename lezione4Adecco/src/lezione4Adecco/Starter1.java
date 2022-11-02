package lezione4Adecco;

public class Starter1 {

	public static void main(String[] args) {

		int cont = 0;

		for (int i = 20; i <= 99; i++) {

			System.out.print(i + " ");
			cont++;

			if (cont == 5) {
				System.out.println();
				cont = 0;

			}
		}
	}
}
