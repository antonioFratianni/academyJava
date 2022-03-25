package interfacciaPolimorfismo;

public class Quadrato implements Risultato{

    @Override
    public void risultato(int x) {
        System.out.println("il quadrato di "+ x+" e : " + x*x);
    }
}
