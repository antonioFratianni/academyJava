package math;

public class Cube extends Solid {

    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double volume() {
        return Math.pow(side, 3);
    }

    @Override
    double surface() {
        return 6 * side * side;
    }

    @Override
    public String print() {
        return "I m a Cube";
    }
}
