package files;

import java.io.IOException;
import java.io.Serializable;

public class UseFile implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new User("Mario", "Rossi");
        System.out.println(p.print());
    }
}
