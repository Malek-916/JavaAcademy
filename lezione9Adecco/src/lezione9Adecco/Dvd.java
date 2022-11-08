package lezione9Adecco;

public class Dvd {
	
	private String titolo;
	private String genere;
	private double durata;
	private boolean isRatingG;
	
	public Dvd() {
		setTitolo("senza titolo");
		setDurata(000);
		setGenere("senza genere");
		setRatingG(false);
	}
	
	public Dvd(String titolo, String genere, double durata, boolean isRatingG) {
		setTitolo(titolo);
		setDurata(durata);
		setGenere(genere);
		setRatingG(isRatingG);
	}

	public String getTitolo() {
		return titolo;
	}
	public String getGenere() {
		return genere;
	}
	public double getDurata() {
		return durata;
	}
	public boolean isRatingG() {

		return isRatingG;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public void setDurata(double durata) {
		this.durata = durata >= 0 ? durata : -durata;
	}
	public void setRatingG(boolean isRatingG) {

		this.isRatingG = isRatingG;
	}
	
	public String toString() {
		String rating = isRatingG ? "yes" : "no bimbi";
		return "Titolo: " + titolo + "\nDurata: " + durata 
				+  "\nGenere: " + genere 
				+ "\nGeneral Audiences : "+ rating;
	}


}
