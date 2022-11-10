package lezioni11Adecco;

public class EsFunzioni {

	public int quantiNumeriMaggioriDiNumero(int[] vettore, int numero) {
		int contatore = 0;
		for (int v : vettore) {
//		contatore = v > numero ? +1 : +0  ; 
			if (v > numero)
				contatore++;
		}
		return contatore;
	}

	public int quantiNumeriSonoDispari(int[] vettore) {
		int contatore = 0;
		for (int v : vettore) {
//			contatore = v > numero ? +1 : +0  ; 
			if (v % 2 != 0)
				contatore++;
		}
		return contatore;
	}

	public int quantiDivisoriNumero(int numero) {
		int contatore = 1;

		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0)
				contatore++;
		}

		return contatore;

	}

	public String[] filtroParoleconTreOpiuLettere(String[] vettore) {
		String[] vettoreNew;
		int paroleCon3OPiuLettere = 0;

		for (String myS : vettore) {
			if (myS.length() >= 3)
				paroleCon3OPiuLettere++;
		}
		vettoreNew = new String[paroleCon3OPiuLettere];

		for (String myS : vettore) {
			if (myS.length() >= 3) {
				paroleCon3OPiuLettere--;
				vettoreNew[paroleCon3OPiuLettere] = myS;
			}
		}
		return vettoreNew;
	}

	public String[] filtroParoleconTreOpiuLettereV2(String[] vettore) {

		String[] vettoreNew;
		String parole = "";

		for (String myS : vettore) {
			if (myS.length() >= 3) {
				parole += myS + ",";
			}
		}
		vettoreNew = parole.split(",");
		return vettoreNew;
	}
}
