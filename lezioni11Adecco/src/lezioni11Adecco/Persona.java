package lezioni11Adecco;

public class Persona {

	private String nome;
	private int eta;
	private Gatto gatto;
	
	
	public Persona (String nome, int eta) {
		setNome(nome);
		setEta(eta);
		setGatto(new Gatto());
	}

	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + ", gatto=" + gatto + "]";
	}


	public Persona(String nome, int eta, Gatto gatto) {
		// TODO Auto-generated constructor stub
		setNome(nome);
		setEta(eta);
		setGatto(gatto);
	}
	

	public String getNome() {
		return nome;
	}
	public int getEta() {
		return eta;
	}
	public Gatto getGatto() {
		return gatto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEta(int eta) {
		this.eta = eta > 0 ? eta : -eta;
	}
	public void setGatto(Gatto gatto) {
		this.gatto = gatto ;
	}
	
	
	
	
	
	
	
	
	
}
