package probabilità;

public class Moneta extends Oggetto {

    public Moneta(){
        x=0;
    }

    public void lancio(){
        x=(int)(Math.random()* 2);
    }
}
