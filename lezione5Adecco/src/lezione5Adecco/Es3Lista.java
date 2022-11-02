package lezione5Adecco;

public class Es3Lista {
	
//	 3.Scrivere un programma che mostra a video i numeri pari
//	 *   compresi tra 0 e 100 in ordine decrescente, cioè da 100 a 0.
	
	
	public static void main(String[] args) {
		
		for(int i = 100;i >= 0; i--) {
			if (i%2==0)
				System.out.println(i);
		}
		
		
	}

}
