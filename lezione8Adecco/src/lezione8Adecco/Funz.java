package lezione8Adecco;

public class Funz {
//	 *  1-Funzione
//	 *  Creare una funzione che prenda
//	 *  in input un numero e resituisca
//	 *  true o false se il numero e' pari
//	 *  restituisce true altrimenti false.

	public boolean isNumPari(int num) {
		return num % 2 == 0;
	}

//	 *  2-Funzione.
//	 *  Creare una funzione che prenda
//	 *  in input una Stringa e ritorna
//	 *  true se la stringa inizia
//	 *  con una vocale altrimenti false.

	public boolean isWordStartWithVocal(String input) {
		return (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'u' || input.charAt(0) == 'i'
				|| input.charAt(0) == 'o');
	}

	
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
