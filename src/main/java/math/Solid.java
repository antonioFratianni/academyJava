package math;

/**
 *
 */
public abstract class Solid implements Printer {

    double ps;

    abstract double volume();

    abstract double surface();

    double peso() {
        return ps * volume();
    }

}
