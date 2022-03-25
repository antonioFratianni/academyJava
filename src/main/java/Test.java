import exceptions.FirstException;

public class Test {

    public static void main(String[] args) throws FirstException {

        int a = 3;

        try {
            //sezione critica
            if (a == 5) {
                FirstException f = new FirstException("error");
                throw f;
            }
        } catch (FirstException t) { //catturo l eccezione
            //gestire l eccezione
            System.out.println("eccezione catturata e gestita");
        }
    }
}


