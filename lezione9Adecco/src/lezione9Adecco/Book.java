package lezione9Adecco;

public class Book {

	private String titolo;
	private String autore;
	private int numPagine;

	public Book() {
		setTitolo("unknown");
		setAutore("tizio caio");
		setNumPagine(000);
	}

	public Book(String titolo, String autore, int numPagine) {
		setTitolo(titolo);
		setAutore(autore);
		setNumPagine(numPagine);
	}

	public String toString() {
		return "Titolo: " + titolo + "\nAutore: " + autore + "\nNumero pagine: " + numPagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public int getNumPagine() {
		return numPagine;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine >= 0 ? numPagine : -numPagine;
	}
}
