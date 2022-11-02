package lezione3Adecco;

public class EsCicli {

	public static void main(String[] args) {
		
		int index = 0;
		
		while (index < 100) {
			
			System.out.print(index + " ");
			index++;
			
			if (index%5==0) 
				System.out.println("");
			
		}
	}
}