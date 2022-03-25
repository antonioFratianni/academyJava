package probabilità;

public abstract class Oggetto {

    protected int x;

    abstract void lancio();
    public int get(){
        return x;
    }
    public void print(){
        System.out.println(get());
    }
}


