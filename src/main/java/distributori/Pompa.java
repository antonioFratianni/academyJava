package distributori;

public class Pompa {

    private int tipoCarburante, carburanteAttuale;
    protected int capacita_serb;

    public Pompa(int capacita_serb) {
        this.capacita_serb = capacita_serb;
    }

    public Pompa(int tipoCarburante, int carb_cont, int capacita_serb) {
        this.tipoCarburante = tipoCarburante;
        this.carburanteAttuale = carb_cont;
        this.capacita_serb = capacita_serb;
    }

    public int getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(int tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public int getCarburanteAttuale() {
        return carburanteAttuale;
    }

    public void setCarburanteAttuale(int carburanteAttuale) {
        this.carburanteAttuale = carburanteAttuale;
    }

    public int getCapacita_serb() {
        return capacita_serb;
    }

    public void setCapacita_serb(int capacita_serb) {
        this.capacita_serb = capacita_serb;
    }

    public void aggiungiCarburante(int c) {
        carburanteAttuale = carburanteAttuale + c;
    }
}
