package com.adecco.veicoli;

public class Motocicletta extends VeicoloAMotore{
    private String tipologia;
    private int numTempiMotore;

    public Motocicletta(String tipologia, int numTempiMotore,int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        setNumTempiMotore(numTempiMotore);
        setTipologia(tipologia);
    }

    @Override
    public String toString() {
        return  "Motocicletta{" +
                "tipologia='" + tipologia + '\'' +
                ", numTempiMotore=" + numTempiMotore + super.toString() +
                '}';
    }

    public Motocicletta() {
        super();
        setNumTempiMotore(2);
        setTipologia("Motard");
    }

    public int getNumTempiMotore() {
        return numTempiMotore;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setNumTempiMotore(int numTempiMotore) {
        this.numTempiMotore = numTempiMotore;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}
