package lezione8Adecco;

public class Es2 {
//	* 		Dati 2 vettori che hanno la stessa dimensione
//	 *     (i vettori sono gia' inizializzati )
//	 *     
//	 *     controllare che la dimensione dei 2 vettori sia 
//	 *     uguale con if.
//	 *     
//	 *     creare un terzo array che ha la seguente forma :
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vettore1 = {1, 2, 3, 4};
		int[] vettore2 = {4, 5, 6, 7};
		
		if (vettore1.length == vettore2.length) {
			int[] vettoreSomma = new int[vettore1.length];
			
			for (int i = 0; i < vettoreSomma.length; i++) {
				vettoreSomma[i] = vettore1[i] + vettore2[i];
				System.out.print(vettoreSomma[i] + " ");
			}
		
		
		}
		
		
		
		
		
		
		
		
	}

}
