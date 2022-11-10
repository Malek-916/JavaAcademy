package lezioni11Adecco;

public class Gatto {

	private String nome;
	private String colore;
	private int eta;
	
	public Gatto() {
		setNome("x");
		setColore("x");
		setEta(0);
	}
	
	@Override
	public String toString() {
		return "Gatto [nome=" + nome + ", colore=" + colore + ", eta=" + eta + "]";
	}

	public Gatto(String nome, String colore, int eta) {
		// TODO Auto-generated constructor stub
		
		setNome(nome);
		setColore(colore);
		setEta(eta);
	}

	public String getNomoe() {
		return nome;
	}

	public String getColore() {
		return colore;
	}

	public int getEta() {
		return eta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setEta(int eta) {
		
		this.eta = eta >= 0 ? eta : -eta;
	}
	
	
	
	
}
