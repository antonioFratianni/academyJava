package interfacciaPolimorfismo;

public class Numero implements Risultato{

    @Override
    public void risultato(int x) {
        System.out.println("il numero e : " + x);
    }
}
