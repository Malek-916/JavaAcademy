package com.adecco.garage;

import com.adecco.veicoli.VeicoloAMotore;

public class Garage {
	
    private VeicoloAMotore veicoli[];

    public Garage(int numVeicoli) {
        setViecoli(new VeicoloAMotore[numVeicoli]);
    }

    public Garage() {
        setViecoli(new VeicoloAMotore[5]);
    }

    public void setViecoli(VeicoloAMotore[] viecoli) {
        this.veicoli = viecoli;
    }

    public int immettiNuovoVeicolo(VeicoloAMotore v) {

        for (int i = 0;i<veicoli.length;i++) {
           if (veicoli[i] == null){
               veicoli[i] = v;
               return i;
           }
        }
        return 666;
    }

    public VeicoloAMotore estraiVeicolo(int posto) {
        if (posto < 0 || posto >= veicoli.length) {
            return null;
        }
        VeicoloAMotore temp = veicoli[posto];
        veicoli[posto] = null;
        return temp;
    }

    public void stampaSituazionePosti() {
        for (VeicoloAMotore v : veicoli) {
            System.out.println(v);
        }
    }

    public boolean postoOccupato(int posizione) {
    	return veicoli[posizione] != null;
    }
}
