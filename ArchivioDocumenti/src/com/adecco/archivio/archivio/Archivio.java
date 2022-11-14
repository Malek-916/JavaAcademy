package com.adecco.archivio.archivio;

import java.util.ArrayList;

import com.adecco.archivio.documento.Documento;

public class Archivio {

	ArrayList<Documento> documenti;
	
	public Archivio() {
		documenti = new ArrayList<>();
	}
	
	
	public void aggiungiDocumento(Documento doc) {
		if (doc== null)
			return;
		
		documenti.add(doc);
	}
	
	public Documento trovaMigliore() {
		if (documenti.isEmpty())
			return null;
		
		Documento temp = documenti.get(0);
		
		for (Documento doc: documenti) {
			if (doc.calcolaQualita() > temp.calcolaQualita())
				temp = doc;
		}

		return temp;
	}
	
	
	
}
