package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        double somma = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci 5 numeri");


        for (int i = 0; i < 5; i++) {
            arrayList.add(input.nextInt());
        }

        for (Integer n : arrayList) {
            somma = somma + n;
        }
        System.out.println("la media e : " + somma / 5);

    }
}
