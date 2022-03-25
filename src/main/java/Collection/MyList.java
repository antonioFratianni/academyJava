package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("uno");
        myList.add("due");
        myList.add("tre");
        myList.add("quattro");

        System.out.println(myList.contains("pippo"));

        List<String> mySubList = myList.subList(1,2);

        for (String s : mySubList) {
            System.out.println(s);
        }

        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("uno");
        myLinkedList.add("due");
        myLinkedList.add("tre");
        myLinkedList.add("quattro");
        myLinkedList.remove(3);
    }
}
