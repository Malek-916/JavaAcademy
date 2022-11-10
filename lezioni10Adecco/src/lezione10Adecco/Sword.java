package lezione10Adecco;

public class Sword {

	private String tipo;
	private int danno;
						
	public Sword() {
		setTipo("ramo");
		setDanno();
	}

	public Sword(String tipo) {
		setTipo(tipo);
		setDanno();
	}

	@Override
	public String toString() {
		return "Sword [tipo=" + tipo + ", danno=" + danno + "]";
	}	

	public String getTipo() {
		return tipo;
	}

	public int getDanno() {
		return danno;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void rompiArma() {
		this.danno = 0;
		this.tipo = "ARMA ROTTA!";
	}

	public void setDanno() {

		if (tipo.equals("spadone"))
			this.danno = 200;
		else if (tipo.equals("spada"))
			this.danno = 100;
		else if (tipo.equals("spada-fuoco"))
			this.danno = 350;
		else
			this.danno = 50;

	}

}
