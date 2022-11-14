package com.adecco.sitemaCode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adecco.sitemaCode.persona.Persona;

public class TestPersona {

	
	@Test
	public void testPersona() {
		Persona p = new Persona("Rossi", 18);
		
		assertEquals(p.getCognome(), "Rossi");
		assertEquals(p.getEta(), 18);
		
		assertFalse(p.getEta() > 30);
	}

}
