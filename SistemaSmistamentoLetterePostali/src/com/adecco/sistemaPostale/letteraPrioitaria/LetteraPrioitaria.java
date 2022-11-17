package com.adecco.sistemaPostale.letteraPrioitaria;

import com.adecco.sistemaPostale.lettera.Lettera;

public class LetteraPrioitaria extends Lettera {
	
	private int priorita;
	
	public LetteraPrioitaria(String mittente, String destinatario, int priorita) {
		super(mittente, destinatario);
		setPriorita(priorita);
	}

	public int getPriorita() {
		if (super.isRitornoAlMittente())
			return 0;	
		return this.priorita;
	}

	public void setPriorita(int priorita) {
		if (priorita < 1)
			this.priorita = 1;
		this.priorita = priorita;
	}

	@Override
	public String toString() {
		return  super.toString() + " LetteraPrioitaria [priorita=" + priorita + "]";
	}
	
	
	
	
	
	

}
