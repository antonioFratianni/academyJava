package Collection;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User("Mario", "Rossi"));
        map.put(2, new User("Luigi", "Bianchi"));

        for (User u : map.values()) {
            System.out.println(u.getName());
        }

    }

}

class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
