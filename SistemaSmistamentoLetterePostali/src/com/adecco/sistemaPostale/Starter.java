package com.adecco.sistemaPostale;

import com.adecco.sistemaPostale.CentraleSmistaPosta.CentraleSmistaPoste;
import com.adecco.sistemaPostale.lettera.Lettera;
import com.adecco.sistemaPostale.letteraPrioitaria.LetteraPrioitaria;

public class Starter {

	public static void main(String[] args) {
		CentraleSmistaPoste c = new CentraleSmistaPoste("123");

		Lettera lettera1 = new Lettera("let111tera standard", "se11nza prio");
		LetteraPrioitaria lettera2prio = new LetteraPrioitaria("22..", "22", 3);
		lettera2prio.setRitornoAlMittente(true);
		LetteraPrioitaria lettera3prio = new LetteraPrioitaria(".33.", "333Lettera Prio", 3);
		LetteraPrioitaria lettera4prio = new LetteraPrioitaria(".44.", "Lett444era Prio", 3);

		c.riceviLettera(lettera1);
		c.riceviLettera(lettera2prio);
		c.riceviLettera(lettera3prio);
		c.riceviLettera(lettera4prio);

		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());

	}

}
