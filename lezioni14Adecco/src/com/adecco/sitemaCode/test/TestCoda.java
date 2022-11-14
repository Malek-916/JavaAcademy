package com.adecco.sitemaCode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adecco.sitemaCode.coda.Coda;
import com.adecco.sitemaCode.codaConPriorita.CodaConPriorita;
import com.adecco.sitemaCode.persona.Persona;

public class TestCoda {

	@Test
	public void test() {
		Coda coda = new Coda();
		Persona p1 = new Persona("gigi", 22);
		Persona p2 = new Persona("kiki", 24);
		
		assertNotNull(coda);
		
		assertTrue(coda.contaPersoneCoda() == 0);
		
		coda.aggiungiPersona(p1);
		assertTrue(coda.contaPersoneCoda() == 1);
		assertEquals(coda.getPersone().get(0), p1);
		
		coda.aggiungiPersona(p2);
		assertEquals(coda.getPersone().get(1), p2);
		
		assertEquals(coda.restituisciProssimo(), p1);
		assertEquals(coda.restituisciProssimo(), p2);
		
		assertTrue(coda.contaPersoneCoda() == 0);
		
	}
	@Test
	public void testCosaConPriorita() {
		
		CodaConPriorita codaConPriorita = new  CodaConPriorita();
		
		Persona p1 = new Persona("gigi", 22);
		Persona p2 = new Persona("kiki", 24);
		Persona p3= new Persona("gigi", 67);
		Persona p4 = new Persona("kiki", 99);
		
		codaConPriorita.aggiungiPersona(p1);
		codaConPriorita.aggiungiPersona(p2);
		codaConPriorita.aggiungiPersona(p3);
		codaConPriorita.aggiungiPersona(p4);
		
		assertEquals(codaConPriorita.restituisciProssimo(), p3);
		assertEquals(codaConPriorita.restituisciProssimo(), p4);
		assertEquals(codaConPriorita.restituisciProssimo(), p1);
		assertEquals(codaConPriorita.restituisciProssimo(), p2);
		
		
		
	}
	
	
	
	
	
}
