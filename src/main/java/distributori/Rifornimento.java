package distributori;

import java.util.ArrayList;
import java.util.Scanner;

public class Rifornimento {

    public static void main(String[] args) {

        ArrayList K = new ArrayList(2);
        K.add(new Distributore("Milano", "Mario", 100));
        K.add(new Distributore("Napoli", "Luigi", 200));

        Scanner input = new Scanner(System.in);

        int i, ch = 0, scelta, var, scelta2 = 0;

        System.out.println("Seleziona il distributore");
        for (i = 0; i < K.size(); i++)
            System.out.println(i + "]" + ((Distributore) K.get(i)).getCitta());
        ch = input.nextInt();

        System.out.println("Ins.num.litri da prelevare ");
        var = ((Distributore) K.get(ch)).rifornimento(input.nextInt());

        System.out.println("Sono stati spesi: " + var + "\n");
        ((Distributore) K.get(ch)).setIncasso(var);

        Distributore Dch = (Distributore) K.get(ch);
        for (i = 0; i < K.size(); i++) {
            if (i != ch) {
                Distributore Di = (Distributore) K.get(i);
                if (Dch.compareTo(Di) > 0)
                    System.out.println(Dch.getProprietario() + " ha più benzina di " + Di.getProprietario());
                else System.out.println(Dch.getProprietario() + " ha meno benzina di " + Di.getProprietario());
            }
        }
    }
}
