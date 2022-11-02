package lezione5Adecco;
import java.util.Scanner;





//*  9. Dati in ingresso un numero stampare a video
//*     tutti i suoi divisori
//*    
//*    Es : 10 ----->  1 2 5 10
//*    
//*    Es :  5 ------>  1  5 
public class Es9Lista {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		int input = scan.nextInt();
		
		for(int i = 1; i <= input; i++) {
			if (input%i==0) 
				System.out.println(i);
		}
		
	}

}
