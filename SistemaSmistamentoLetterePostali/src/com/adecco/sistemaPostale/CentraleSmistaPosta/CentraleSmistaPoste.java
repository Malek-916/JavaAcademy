package com.adecco.sistemaPostale.CentraleSmistaPosta;

import java.util.ArrayList;

import com.adecco.sistemaPostale.lettera.Lettera;
import com.adecco.sistemaPostale.letteraPrioitaria.LetteraPrioitaria;

public class CentraleSmistaPoste {

	private String codiceCentrale;
	private ArrayList<Lettera> lettere;

	public CentraleSmistaPoste(String codicePostale) {
		lettere = new ArrayList<>();
		this.codiceCentrale = codicePostale;
	}

	public void riceviLettera(Lettera let) {
		if (let.equals(null))
			return;

		lettere.add(let);
	}

	public int posizioneLetteraPrio() {
		int i = 0;
		for (Lettera let : lettere) {

			if (let instanceof LetteraPrioitaria)
				return i;
			i++;
		}
		return -1;
	}

	public boolean isPresPrio() {

		for (Lettera let : lettere) {
			if (let instanceof LetteraPrioitaria)
				return true;
		}
		return false;
	}

	public Lettera smistaLettera() {

		if (lettere.isEmpty())
			return null;

		LetteraPrioitaria tmpPrio = null;
		Lettera tmp = null;

		if (posizioneLetteraPrio() != -1)
			tmpPrio = (LetteraPrioitaria) lettere.get(posizioneLetteraPrio());
		else
			tmp = (Lettera) lettere.get(0);

		if (isPresPrio()) {
			for (Lettera let : lettere) {

				if (let instanceof LetteraPrioitaria && tmpPrio instanceof LetteraPrioitaria) {
					if (((LetteraPrioitaria) let).getPriorita() > tmpPrio.getPriorita())
						tmpPrio = (LetteraPrioitaria) let;
				}
			}
			lettere.remove(tmpPrio);
			return tmpPrio;
		}
		lettere.remove(tmp);
		return tmp;
	}

}
