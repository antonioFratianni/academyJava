package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("primo");
        arrayList.add("secondo");
        arrayList.add("terzo");

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci tre numeri");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        //iterator
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //ciclo for
        for (String s : arrayList){
            System.out.println(s);
        }

    }
}
