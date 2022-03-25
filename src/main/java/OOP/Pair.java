package OOP;

public class Pair<T, K> implements Interfaces {

    private T first;
    private K second;

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecond() {
        return second;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    @Override
    public void stampa() {
        System.out.println("ciao from stampa da interface");
    }

    public static void main(String[] args) {

        Pair<String, Integer> p = new Pair<>("oggetto1", 2);

        String first = p.getFirst();
        int second = p.getSecond();

        System.out.println(first);
        System.out.println(second);

        p.stampa();



    }
}
