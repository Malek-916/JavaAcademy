public class Garage {
    private VeicoloAMotore viecoli[];

    public Garage(int numVeicoli) {
        setViecoli(new VeicoloAMotore[numVeicoli]);
    }

    public Garage() {
        setViecoli(new VeicoloAMotore[15]);
    }

    public void setViecoli(VeicoloAMotore[] viecoli) {
        this.viecoli = viecoli;
    }

    public int immettiNuovoVeicolo(VeicoloAMotore v) {

        for (int i = 0;i<viecoli.length;i++) {
           if (viecoli[i] == null){
               viecoli[i] = v;
               return i;
           }
        }
        return 666;
    }

    public VeicoloAMotore estraiVeicolo(int posto) {
        if (posto < 0 || posto >= viecoli.length) {
            return null;
        }
        VeicoloAMotore temp = viecoli[posto];
        viecoli[posto] = null;
        return temp;
    }

    public void stampaSituazionePosti() {
        for (VeicoloAMotore v : viecoli) {
            System.out.println(v);
        }
    }

}
