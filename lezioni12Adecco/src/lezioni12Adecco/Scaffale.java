package lezioni12Adecco;

public class Scaffale {

	private Bevanda[] bevande;

	
	public Scaffale(int lunghezza) {
		bevande = new Bevanda[lunghezza];
	}
	
	public Scaffale() {
		this(10);
	}

	public void stampaBevande() {

		for (int i = 0; i<bevande.length;i++) {			
				System.out.println( "indice: "+i + " ==> " + bevande[i]);
		}
	}

	public void fillAll() {
		
		for (int i = 0; i<bevande.length; i++) {
			if (bevande[i] == null)
				bevande[i] = new Bevanda();
		}
	}
	
	public double sommaScaffale() {

		double somma = 0;

		for (Bevanda b : bevande) {
			if (b == null)
				continue;

			somma += b.getCosto();
		}
		return somma;
	}

	public double sommaScaffale(String nomeBevanda) {

		int somma = 0;

		for (Bevanda b : bevande) {
			if (b == null)
				continue;

			if (b.getName().equalsIgnoreCase(nomeBevanda))
				somma += b.getCosto();
		}
		return somma;
	}

	public boolean aggiungiBevanda(Bevanda b) {

		if (b == null)
			return false;

		for (int i = 0; i<bevande.length;i++) {
			if (bevande[i] == null) {
				bevande[i] = b;
				return true;
			}
		}
		return false;
	}

	public Bevanda removeBevanda(int posizione) {

		if (posizione >= bevande.length || posizione < 0)
			return null;

		Bevanda bevTemp = bevande[posizione];
		bevande[posizione] = null;

		return bevTemp;
	}

	public Bevanda[] getBevande() {
		return bevande;
	}

}
