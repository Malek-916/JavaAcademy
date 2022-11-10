package lezione10Adecco;

public class Persona {

	private String nome;
	private int eta;
	private Car auto;
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" +
				eta + ", auto=" + auto + "]";
	}

	public Persona(String nome, int eta, Car auto) {
		setEta(eta);
		setNome(nome);
		setAuto(auto);
	}
	
	public Persona(String nome, int eta) {
		setEta(eta);
		setNome(nome);
		setAuto(new Car());
	}


	public Car getAuto() {
		return auto;
	}


	public void setAuto(Car auto) {
		if (auto != null)
			this.auto = auto;
		else
			this.auto = new Car();
	}


	public String getNome() {
		return nome;
	}


	public int getEta() {
		return eta;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
}
