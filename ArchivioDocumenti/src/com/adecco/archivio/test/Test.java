package com.adecco.archivio.test;

import static org.junit.Assert.*;

import com.adecco.archivio.archivio.Archivio;
import com.adecco.archivio.documento.Documento;
import com.adecco.archivio.documentoPrioritario.DocumentoPrioritario;

public class Test {

	@org.junit.Test
	public void testTrovaMigliore() {
		Archivio ar = new Archivio();
		Documento doc1 = new Documento("123");
		Documento doc2 = new Documento("1234");
		Documento doc3 = new Documento("12345");
		
		DocumentoPrioritario doc4 = new DocumentoPrioritario("123456", 1);
		DocumentoPrioritario doc5 = new DocumentoPrioritario("1234567", 2);
		
		ar.aggiungiDocumento(doc1);
		ar.aggiungiDocumento(doc2);
		ar.aggiungiDocumento(doc3);
		ar.aggiungiDocumento(doc4);
		ar.aggiungiDocumento(doc5);
		
		assertEquals(ar.trovaMigliore(), doc5);
	}

	
	
	
}
