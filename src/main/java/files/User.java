package files;

import java.io.*;

public class User extends Person implements Stream<User>, Serializable {

    public User(String name, String lastName) {
        super(name, lastName);
    }



    @Override
    String print() throws IOException, ClassNotFoundException {
        write();
        read();
        User u = read();
        return  (u.getName() + " "+ u.getLastName());
    }

    @Override
    public void write() throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("temp.dat"));

        Person p = new User("Mario", "Rossi");//Polimorfismo

        objectOutputStream.writeObject(p);
    }

    @Override
    public User read() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("temp.dat"));
        User u = (User) objectInputStream.readObject();

        return null;
    }
}
