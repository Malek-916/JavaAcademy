package com.adecco.sitemaCode.coda;

import java.util.Random;

import com.adecco.sitemaCode.codaConPriorita.CodaConPriorita;
import com.adecco.sitemaCode.persona.Persona;

public class Startert {

	public static void main(String[] args) {

		CodaConPriorita codaConPriorita = new CodaConPriorita();
		Random rand = new Random();

		for (int i = 1; i <= 3; i++) {
			codaConPriorita.aggiungiPersona(new Persona("" + i, rand.nextInt(10, 85)));
		}

		codaConPriorita.stampaPersone();

		System.out.println("###############");
		System.out.println("Perosna servita:  " + codaConPriorita.restituisciProssimo());
		System.out.println("Perosna servita:  " + codaConPriorita.restituisciProssimo());
		System.out.println("Perosna servita:  " + codaConPriorita.restituisciProssimo());
		System.out.println("Perosna servita:  " + codaConPriorita.restituisciProssimo());
		System.out.println("###############");

		codaConPriorita.stampaPersone();

	}

}
