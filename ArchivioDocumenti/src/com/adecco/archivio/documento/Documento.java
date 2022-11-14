package com.adecco.archivio.documento;

public class Documento {

private String testo;

public Documento(String unTesto) {
	setTesto(unTesto);
}

public void setTesto(String testo) {
	this.testo = testo;
}

public double calcolaQualita() {


	
	return testo.isEmpty() ? 0 : 1/(1+testo.length());
}


@Override
public String toString() {
	return "Documento [testo=" + testo + "]";
}


public String getTesto() {
	return testo;
}






}
