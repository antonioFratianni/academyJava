package contocorrente;

public class User extends Person{

    @Override
    public void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        User u = new User();
        u.print("HI");
    }
}
