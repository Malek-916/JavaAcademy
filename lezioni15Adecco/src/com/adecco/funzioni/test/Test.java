package com.adecco.funzioni.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import com.adecco.funzioni.Funzione;

public class Test {

	@org.junit.Test
	public void testMaggioranzaTrue() {
		
		Funzione funzione = new Funzione();
		boolean[] vettore = { true, true, false };
		boolean[] vettore2 = { false,true,false };
		boolean[] vettore3 = { false, false, true, true };
		
		
		assertTrue(funzione.isMaggioranzaTrue(vettore));
		assertFalse(funzione.isMaggioranzaTrue(vettore2));
		assertTrue(funzione.isMaggioranzaTrue(vettore3));
	}

	@org.junit.Test
	public void testSommatoriaStringhe() {
		Funzione fu = new Funzione();
		
		ArrayList<String> stringhe = new ArrayList<>();
		stringhe.add("ciao");
		stringhe.add("miao");
		stringhe.add("C");
		
		assertTrue(fu.sommatoriaStringhe(stringhe) == 9 );
		assertEquals(9, fu.sommatoriaStringhe(stringhe));
		
		
	}
	
	
	
	
	
	
	
}
  