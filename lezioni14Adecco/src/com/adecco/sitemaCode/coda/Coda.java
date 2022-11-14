package com.adecco.sitemaCode.coda;

import java.util.ArrayList;
import com.adecco.sitemaCode.persona.Persona;

public class Coda {

	private ArrayList<Persona> persone;

	
	public ArrayList<Persona> getPersone() {
		if (persone.isEmpty()) 
			return null;
		return persone;
	}
	
	public Coda() {
		this.persone = new ArrayList<>();
	}

	public void stampaPersone() {
		
		if (persone.isEmpty()) {
			System.out.println("non ci sono persone in coda");
			return;
		}

		for (Persona p : persone) {
			System.out.println(p);
		}
	}

	public void aggiungiPersona(Persona persona) {
		if (persona == null)
			return;

		persone.add(persona);
	}

	public Persona restituisciProssimo() {

		if (persone.isEmpty())
			return null;

		Persona temp = persone.get(0);
		persone.remove(0);
		return temp;

	}

	public int contaPersoneCoda() {
		if (persone.isEmpty())
			return 0;
		return persone.size();
	}


}
