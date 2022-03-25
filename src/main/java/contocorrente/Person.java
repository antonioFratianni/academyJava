package contocorrente;
//non e possibile istanziarla
//puo contenere metodi astratti

public abstract class Person {

    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //il metodo ha solo la firma
    public abstract void print(String s);

}
