package lezione10Adecco;

import java.util.Random;

public class Mago {

	private String nome;
	private int puntiVita;
	private boolean isAlive;
	private Sword spada;

	public Mago() {
		setNome("gigi");
		setPuntiVita(100);
		setAlive(true);
		setSpada(new Sword());
	}
	
	public Mago(String nome, int puntiVita, Sword spada) {
		setNome(nome);
		setPuntiVita(puntiVita);
		setAlive(true);
		setSpada(spada);
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public void setSpada(Sword spada) {

		this.spada = spada != null ? spada : new Sword();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;

		if (this.puntiVita <= 0)
			isAlive = false;

	}

	public Sword getspada() {
		return this.spada;
	}

	public String getNome() {
		return this.nome;
	}

	public int getPuntiVita() {
		return this.puntiVita;
	}

	public boolean isAlive() {
		return isAlive;
	}

	@Override
	public String toString() {

		String statoSalute = isAlive ? "vivo" : "morto";

		return "Mago [nome=" + nome + ", puntiVita=" + puntiVita + " " + statoSalute + ", spada=" + spada + "]";
	}

	/**
	 * Danno compreso tra 20-50
	 * 
	 * @return int 
	 */
	public int folataMagica() {
		return new Random().nextInt(20,51);
	}
	
	/**
	 * 30% di fallire 
	 * 40% di togliere un danno compreso 20-50
	 * 30% colpo critico 20-150
	 * @return int
	 */
	public int raggioRosso() {
		Random random = new Random();
		
		int sceltaDanno = random.nextInt(1 , 11);
		
		if (sceltaDanno > 7) 
			return random.nextInt(20, 150);
		else if (sceltaDanno >= 4) 
			return random.nextInt(20 , 50);
		
		return 0;
	}
	
	/**
	 * Calcolo danno con la spada del mago
	 * @return int
	 */
	public int dannoSpada() {
		Random random = new Random();
		int scelta = random.nextInt(0, 101);
		int dannoExtra = random.nextInt(0,11);
		// 3% di possibilita di rompere l'arma
		if (scelta>= 98) 
			this.spada.rompiArma();
		
		if (this.spada.getTipo().equalsIgnoreCase("spadone"))
				dannoExtra += 2;
			
		return spada.getDanno()+dannoExtra;
	}
	
	
	
	
	
	
	
}