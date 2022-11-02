package lezion1Adecco;

public class Esercizio {
	public static void main(String[] args) {
		// Calcolare i punti di una squadra	dalle vitt,sconf, pareg
		
		int vitt = 13, sconf = 50, pareg = 5;
		int totPunti = (vitt*3) + pareg;
		
		System.out.println("Punti della squadra:"
				+ "\nVittorie: " + vitt +
				"\nSconfitta: " + sconf + 
				"\nPareggi: " + pareg + "\nTotale punti squadra: " + totPunti);
		
		}	
}
