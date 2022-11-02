package lezione5Adecco;
import java.util.Scanner;

//11.Creare un programma che chieda in input
//*    una serie di numeri fino a che non si inserisce
//*    un valore negativo
//*    ( NOTA SI CHIAMANO CICLI INDEFINITI )
//*    
//*    
//*    Es : 10 2 8 8 10 2 -1 -----> fine
public class Es11Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 1;
		while (num>0) {
			System.out.println("Caccia num, per uscire neg");
			num = scan.nextInt();
			
		}
		System.out.println("sei libero");

	}

}
