package iliad;

import java.util.Scanner;

public class Servicies implements Features {

    Sim sim;

    public Servicies(Sim sim) {
        this.sim = sim;
    }

    @Override
    public void addCall() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la durata della chiamata");
        sim.calls.add(input.nextInt());
    }

    @Override
    public void callsTime() {

        int somma = 0;
        for (Integer n : sim.calls) {
             somma = somma + n;
        }
    }

    @Override
    public void specificCalls() {

    }
}
