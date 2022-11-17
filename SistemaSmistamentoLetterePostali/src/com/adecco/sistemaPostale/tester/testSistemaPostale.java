package com.adecco.sistemaPostale.tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.adecco.sistemaPostale.CentraleSmistaPosta.CentraleSmistaPoste;
import com.adecco.sistemaPostale.lettera.Lettera;
import com.adecco.sistemaPostale.letteraPrioitaria.LetteraPrioitaria;

class testSistemaPostale {

	@Test
	void test() {
		CentraleSmistaPoste c = new CentraleSmistaPoste("123");
		
		
		Lettera lettera1 = new Lettera("lettera standard","senza prio");
		LetteraPrioitaria lettera2prio = new LetteraPrioitaria("..", "Lettera Prio", 3);
		lettera2prio.setRitornoAlMittente(true);
		LetteraPrioitaria lettera3prio = new LetteraPrioitaria("..", "Lettera Prio", 3);
		LetteraPrioitaria lettera4prio = new LetteraPrioitaria("..", "Lettera Prio", 3);
		
		c.riceviLettera(lettera1);
		c.riceviLettera(lettera2prio);
		c.riceviLettera(lettera3prio);
		c.riceviLettera(lettera4prio);
		
assertEquals(c.smistaLettera(), lettera3prio);
assertEquals(c.smistaLettera(), lettera4prio);
assertEquals(c.smistaLettera(), lettera1);
assertEquals(c.smistaLettera(), lettera2prio);
assertEquals(c.smistaLettera(), null);
		
		
		
		
		
		
//		assertTrue(c.smistaLettera().equals(lettera3prio) );
//		assertTrue(c.smistaLettera().equals(lettera4prio) );
//		assertTrue(c.smistaLettera().equals(lettera1) );
//		assertTrue(c.smistaLettera().equals(lettera2prio) );
//		assertTrue(c.smistaLettera().equals(null) );
		
	}

}
