package OOP;

public class TestRettangolo {

    public static void sommaPerimetri(Rettangolo r1, Rettangolo r2, Rettangolo r3){
        r1.calcolaPerimetro();
        r2.calcolaPerimetro();
        r3.calcolaPerimetro();
    }

    public static void sommaAree(Rettangolo r1, Rettangolo r2, Rettangolo r3){
        r1.calcolaArea();
        r2.calcolaArea();
        r3.calcolaArea();
    }


    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(6,3);
        Rettangolo rettangolo2 = new Rettangolo(8,4);
        Rettangolo rettangolo3 = new Rettangolo(10,5);

        sommaPerimetri(rettangolo1,rettangolo2,rettangolo3);

        sommaAree(rettangolo1,rettangolo2,rettangolo3);


        double sommaPerimetri = rettangolo1.perimetro + rettangolo2.perimetro + rettangolo3.perimetro;
        System.out.println(sommaPerimetri);

        double sommaAree = rettangolo1.area + rettangolo2.area + rettangolo3.area;
        System.out.println(sommaAree);

    }
}
