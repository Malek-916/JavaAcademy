package com.adecco.veicoli;

public class VeicoloAMotore {

  private int annoImmatricolazione;
  private String marca;
  private String tipoAlimentazione;
  private int cilindrata;

  public VeicoloAMotore() {

      setAnnoImmatricolazione(2022);
      setCilindrata(1900);
      setMarca("Ford");
      setTipoAlimentazione("Benzina");
  }

    @Override
    public String toString() {
        return "VeicoloAMotore{" +
                "annoImmatricolazione=" + annoImmatricolazione +
                ", marca='" + marca + '\'' +
                ", tipoAlimentazione='" + tipoAlimentazione + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }

    public VeicoloAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
      setAnnoImmatricolazione(annoImmatricolazione);
      setCilindrata(cilindrata);
      setMarca(marca);
      setTipoAlimentazione(tipoAlimentazione);
  }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getMarca() {
        return marca;

    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoAlimentazione(String tipoAlimentazione) {
        this.tipoAlimentazione = tipoAlimentazione;
    }
}
