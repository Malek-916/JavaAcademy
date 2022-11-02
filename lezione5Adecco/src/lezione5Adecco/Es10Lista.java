package lezione5Adecco;
import java.util.*;


//*  10.  Stabilire se un numero in ingresso e' primo
//*      ( nota un numero è primo se ho al massimo 2 divisori
//*       che sono 1 e se stesso )
//*       
//*       7 è primo ---> i suoi divisori sono 1 e 7
//*       
//*       10 non è primo ---> perchè ho 1 2 5 10 


public class Es10Lista {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int divisori = 0;
		
		for(int i = 1; i <= input; i++) {
			if (input%i==0) 
				divisori++;
		}
		System.out.println(divisori);
		String ris = divisori == 2? "si primo":"no primo";
		System.out.println(ris);
	}
}
