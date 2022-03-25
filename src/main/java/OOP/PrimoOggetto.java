package OOP;
//<modificatore di visibilita> <keyword class> <nome classe>

    //field, le variabili di istanza
    //metodi modificatori
    //costruttori
    //metodi accessori

    //<modificatore di visibilità> -> [private, public, protected, virtual]
    //<tipo di dato> [tipo primitivo, reference]
    //<identificatore [nome della variabile di istanza]

    //get[nome variabile di istanza] e set [nome variabile di istanza]

    //private piu get e set -> incapsulamento

    //FIRMA DI UN METODO: <modificatore di visibilita> <[dato di ritorno]> <nome del metodo> <lista dei parametri>

        //Set, List, Queue, HashMap


import java.net.StandardSocketOptions;

public class PrimoOggetto extends Oggetto {

    private String name;

    public PrimoOggetto() {//costruttore di default
        super();
    }

    public PrimoOggetto(String name) {//override costruttore
        this.name = name;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    //signature importante per il refactor -> overloading, overriding

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        //CREARE L OGGETTO DESCRITTO
        PrimoOggetto primoOggetto = new PrimoOggetto();
        primoOggetto.setName("Marco");

        PrimoOggetto primoOggetto1 = new PrimoOggetto("Christian");

        char[] parola = {'o', 's', 's', 'o'};
        Oggetto oggetto = new Oggetto(4, parola);

        if (oggetto.isPalindrome(oggetto)){
            System.out.println("La parola è palindroma");
        }else{
            System.out.println("La parola non è palindroma");

        }
    }

}
