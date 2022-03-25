package interfacciaPolimorfismo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int x = 0;
        Quadrato q = new Quadrato();
        Cubo c = new Cubo();
        Risultato r =new Numero();

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        x = input.nextInt();

        r.risultato(x);
        r=q;
        r.risultato(x);
        r=c;
        r.risultato(x);
    }
}
