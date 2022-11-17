package com.adecco.sistemaPostale;

import com.adecco.sistemaPostale.CentraleSmistaPosta.CentraleSmistaPoste;
import com.adecco.sistemaPostale.lettera.Lettera;
import com.adecco.sistemaPostale.letteraPrioitaria.LetteraPrioitaria;

public class Starter {

	public static void main(String[] args) {
		CentraleSmistaPoste c = new CentraleSmistaPoste("123");
		
		Lettera let1 = new Lettera("wq", "qw");
		LetteraPrioitaria letP1 = new LetteraPrioitaria("21", "12", 3);
		
		Lettera let2 = new Lettera("wq", "qw");
		LetteraPrioitaria letP2 = new LetteraPrioitaria("21", "12", 2);
		
		c.riceviLettera(letP1);
		c.riceviLettera(let1);
		c.riceviLettera(letP2);
		c.riceviLettera(let2);
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());
		System.out.println(c.smistaLettera());


	}
	

}
