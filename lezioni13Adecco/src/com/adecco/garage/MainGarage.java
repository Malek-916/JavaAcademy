package com.adecco.garage;

import java.util.Scanner;

import com.adecco.veicoli.Automobile;
import com.adecco.veicoli.Furgone;
import com.adecco.veicoli.Motocicletta;
import com.adecco.veicoli.VeicoloAMotore;

public class MainGarage {
	
	private Scanner scan;
	private Garage garage;
	private int input;
	
	public MainGarage(int numeroPosti) {
		scan = new Scanner(System.in);
		garage = new Garage(numeroPosti);
	}

	public MainGarage() {

		scan = new Scanner(System.in);
		garage = new Garage();
	}

	public void menu() {
		System.err.println("Cazzo vuoi fare ??!!");
		System.out.println("Inserisci '1' per inserire un veicolo");
		System.out.println("Inserisci '2' per rimuovere un veicolo");
		System.out.println("Inserisci '3' per stampare la situazione ");
		System.out.println("Inserisci '4' per andartene");
		System.err.print("> ");
		input = scan.nextInt();
		System.out.println("");
	}
	
	public int immissione() {
		System.out.println("Inserisci '1' per inserire un auto");
		System.out.println("Inserisci '2' per inserire una moto");
		System.out.println("Inserisci '3' per inserire un furgone\n> ");
		
		VeicoloAMotore v = null;
		
		switch (scan.nextInt()) {
		case 1:
			v = new Automobile();
			return garage.immettiNuovoVeicolo(v);
		
		case 2:
			v = new Motocicletta();
			return garage.immettiNuovoVeicolo(v);
			
		case 3:
			v = new  Furgone();
			return garage.immettiNuovoVeicolo(v);
	
		}
		return 666;
	}
	
	public int immissione(VeicoloAMotore veivolo) {
		System.out.println("Inserisci '1' per inserire un auto");
		System.out.println("Inserisci '2' per inserire una moto");
		System.out.println("Inserisci '3' per inserire un furgone\n> ");
		input= scan.nextInt();
		return garage.immettiNuovoVeicolo(veivolo);

	}
	
	public VeicoloAMotore estraiVeicolo() {
		System.out.print("Inserisci indice della posizione che intendi rimuovere\n> ");
		input = scan.nextInt();
		if (garage.postoOccupato(input))
			System.out.println( "Rimosso ==>" + garage.estraiVeicolo(input) + "\n");
		else 
			System.err.println("Non esiste!!!!!!\n");
			return null;
	}
	
	public void stampaSituazionePosti() {
		
		garage.stampaSituazionePosti();
		System.out.println("");
	}
	
	public void ui() {
		boolean isGoing = true;
		
		while (isGoing) {
			
			menu();
			
			switch (input) {
			case 1: 
				System.out.println("Inserito nella posizione: " + immissione() + "\n");
				break;
				
			case 2: 
				estraiVeicolo();
				break;
				
			case 3:
				stampaSituazionePosti();
				break;
				
			case 4:
				System.err.println("Fuori dai coglioni!!");
				isGoing = false;
				break;
				
			default:
				System.err.println("Non hai inserito un valore corretto pirla!!\n"
						+ "RIPROVA\n");
			}
			
			
			
			
			
			
		}
		
		
		
		
	}
	
}
