package lezione6Adecco;
import java.util.*;
public class Es2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		boolean tuttiMultipli3 = true ;

		do {
			System.out.println("> Numero: ");
			input = scan.nextInt();
			
			if (input % 3 != 0 && input < 20) 
				tuttiMultipli3 = false;
			
		} while (input < 20);
		
		System.out.println("Valore: " + tuttiMultipli3);
		
		
		
		
	}
}
