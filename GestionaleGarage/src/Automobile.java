public class Automobile extends VeicoloAMotore {
    private int numeroporte ;

    public Automobile(int numeroporte, int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        setNumeroporte(numeroporte);
    }

    public Automobile() {
        super();
        setNumeroporte(4);
    }

    @Override
    public String toString() {
        return super.toString() + "Automobile{" +
                "numeroporte=" + numeroporte +
                '}';
    }

    public void setNumeroporte(int numeroporte) {
        this.numeroporte = numeroporte;
    }

    public int getNumeroporte() {
        return numeroporte;
    }
}
