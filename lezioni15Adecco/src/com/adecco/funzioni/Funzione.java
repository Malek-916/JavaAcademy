package com.adecco.funzioni;

import java.util.ArrayList;

public class Funzione {

//	1 ) CREARE UNA FUNZIONE CHE PRENDA IN INPUT UN VETTORE
//DI BOOLEAN E RITORNA SE TRUE SE IL NUMERO DI TRUE E' MAGGIORE
//DEI NUMERI DEL FALSE
//
//
//[ true , true , true , false ]    -----> true 
// [ true , false , false , false ]    -----> false 

	public boolean isMaggioranzaTrue(boolean[] vettore) {
			int contatoreTrue = 0;
			int contatoreFalse = 0;
			
			for (boolean bool: vettore) {
				if (bool)
					contatoreTrue++;
				else 
					contatoreFalse++;
			} 
			return   contatoreTrue       >=  contatoreFalse ;
		}
	
//	2) CREARE UNA FUNZIONI CHE PRENDA IN INGRESSO
//	  UN ARRAYLIST DI STRING E  RITORNI LA
//	   SOMMATORIA DI TUTTE LE PAROLE :
//	   
//	   EX :  "CIAO" , "MIAO" , "C" --------> 9 
//	   
//	   INPUT UN ARRAYLIST DI TIPO STRING
//	   OUT   UN NUMERO INTERO
//	
	
	public int sommatoriaStringhe(ArrayList<String> stringhe) {
		
		int somma = 0;
		
		for(String st: stringhe) {
			somma += st.length();
		}
		return somma;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
