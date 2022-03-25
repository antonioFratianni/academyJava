package distributori;

public class Distributore implements Comparable {

    public String getCitta() {
        return citta;
    }

    public String getProprietario() {
        return proprietario;
    }

    private String citta, proprietario;
    protected Pompa p;
    private int costo_litro = 1, costo_vendita = 2, incasso = 0, spesa, ricavo;

    public Distributore(String citta, String proprietario, int capacita) {
        this.citta = citta;
        this.proprietario = proprietario;
        p = new Pompa(capacita);
    }


    @Override
    public int compareTo(Distributore h) {
        return (this.p.capacita_serb - h.p.capacita_serb);
    }

    public Pompa getP() {
        return p;
    }

    public void setP(Pompa p) {
        this.p = p;
    }

    public int getCosto_litro() {
        return costo_litro;
    }

    public void setCosto_litro(int costo_litro) {
        this.costo_litro = costo_litro;
    }

    public int getCosto_vendita() {
        return costo_vendita;
    }

    public void setCosto_vendita(int costo_vendita) {
        this.costo_vendita = costo_vendita;
    }

    public int getIncasso() {
        return incasso;
    }

    public void setIncasso(int incasso) {
        this.incasso = incasso;
    }

    public int rifornimento(int litri) {
        int x;
        if (litri < p.getCapacita_serb()) {
            x = p.getCapacita_serb();
            x = x - litri;
            p.setCapacita_serb(x);
            return costo_vendita * litri;
        } else {
            System.out.println("Litri non disponibili");
            return p.getCarburanteAttuale();
        }
    }
}