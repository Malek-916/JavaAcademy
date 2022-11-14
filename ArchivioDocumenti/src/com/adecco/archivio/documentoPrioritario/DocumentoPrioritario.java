package com.adecco.archivio.documentoPrioritario;

import com.adecco.archivio.documento.Documento;

public class DocumentoPrioritario extends Documento {

private int incremento;
	
	public DocumentoPrioritario(String unTesto, int incremento) {
		super(unTesto);
		setIncremento(incremento);
	}

	public double calcolaQualita() {
		return super.getTesto().isEmpty() ? 0: super.calcolaQualita()+incremento;
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	
}
