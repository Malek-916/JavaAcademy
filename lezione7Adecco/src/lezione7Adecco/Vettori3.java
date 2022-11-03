package lezione7Adecco;

public class Vettori3 {
	
	public static void main(String[] args) {
		
		int[] vettore = {1, 2, 3, 4, 5};
		// doubling
		for (int i = 0; i < vettore.length; i++) {
		
			vettore[i] *= 2;
			System.err.println(vettore[i] + " ");
		}

	}
}

