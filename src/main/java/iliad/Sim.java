package iliad;

import java.util.ArrayList;

public class Sim {

    private String number;
    private float credit;
    ArrayList<Integer> calls = new ArrayList<Integer>();

    public Sim(String number, float credit, ArrayList<Integer> calls) {
        this.number = number;
        this.credit = credit;
        this.calls = calls;
    }
}
