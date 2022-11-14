package com.adecco.sitemaCode.codaConPriorita;

import com.adecco.sitemaCode.coda.Coda;
import com.adecco.sitemaCode.persona.Persona;

public class CodaConPriorita extends Coda {
	
	public CodaConPriorita() {
		super();
	}
	
	private Persona cercaPcon60() {
		
		if (super.getPersone() == null) {
			return null;
		}
		
		for (int i = 0; i < super.getPersone().size(); i++) {
			if (super.getPersone().get(i).getEta() >= 60) 
				return super.getPersone().get(i);
		}
		return null;
	}
	
@Override
public Persona restituisciProssimo () {
	
	if (super.getPersone() == null) {
		return null;
	}
	Persona temp = cercaPcon60();
	
	if (temp != null) {
		super.getPersone().remove(temp);
		return temp;
	} else 
		return super.restituisciProssimo();
	
}

	

}
