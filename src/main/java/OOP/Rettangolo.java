package OOP;

public  class Rettangolo implements Operazioni {

    double base;
    double altezza;

    double area = 0;
    double perimetro = 0;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    @Override
    public void calcolaPerimetro(){
        perimetro = 2*(base + altezza);
    }

    @Override
    public void calcolaArea() {
          area = base*altezza;
    }

    @Override
    public void aggiornaPerimetro() {

    }

    @Override
    public void aggiornaArea() {

    }
}

