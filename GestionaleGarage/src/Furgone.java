public class Furgone extends VeicoloAMotore{
    private int capacitaCarico;

    public Furgone(int capacitaCarico,int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata){
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        setCapacitaCarico(capacitaCarico);
    }

    public Furgone() {
        super();
        setCapacitaCarico(500);
    }

    @Override
    public String toString() {
        return super.toString() + "Furgone{" +
                "capacitaCarico=" + capacitaCarico +
                '}';
    }

    public void setCapacitaCarico(int capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    public int getCapacitaCarico() {
        return capacitaCarico;
    }
}
