package lezione9Adecco;

public class Persona {

	private String nome;
	private int eta;

	public void setEta(int eta) {
		this.eta = eta > 0  ? eta : -eta; 
	}
	
	public void setNome(String nome) {
		this.nome = nome.length() > 3 ? nome : "unknown";
	}
	
	public int getEta() {
		return eta;
	}

	public String getNome() {
		return nome;
	}

	public void salutami() {
		System.out.print("Ciao mi chiamo " + nome + "\neta: " + eta);
	}
	
	
	
	
	
	
	
	
}
