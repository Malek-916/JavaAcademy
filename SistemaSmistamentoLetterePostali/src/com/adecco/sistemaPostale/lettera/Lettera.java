package com.adecco.sistemaPostale.lettera;

public class Lettera {
	private String mittente;
	private String destinatario;
	private boolean ritornoAlMittente;
	
	public Lettera(String mittente, String destinatario) {
		setMittente(mittente);
		setDestinatario(destinatario);
		setRitornoAlMittente(false);
	}

	public String getMittente() {
		return mittente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public boolean isRitornoAlMittente() {
		return ritornoAlMittente;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public void setRitornoAlMittente(boolean ritornoAlMittente) {

		
		this.ritornoAlMittente = ritornoAlMittente;
	}

	
	
	@Override
	public String toString() {
		return "Lettera [mittente=" + mittente + ", destinatario=" + destinatario + ", ritornoAlMittente="
				+ ritornoAlMittente + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
