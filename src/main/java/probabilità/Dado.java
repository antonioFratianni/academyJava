package probabilità;

public class Dado extends Oggetto{

    public Dado(){
        x=1;
    }
    public void lancio(){
        x=(1+(int)(Math.random()* 6));
    }
}

