package interfacciaPolimorfismo;

public class Cubo implements Risultato {

    @Override
    public void risultato(int x) {
        System.out.println("il cubo di "+x+"e : " + (x*x*x));
    }
}
