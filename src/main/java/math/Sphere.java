package math;

public class Sphere extends Solid implements Printer {

    double ray;

    public Sphere(double ray) {
        this.ray = ray;
    }

    @Override
    double volume() {
        return 4 / 3 * Math.PI * Math.pow(ray, 3);
    }

    @Override
    double surface() {
        return 4 * Math.PI * ray * ray;
    }

    @Override
    public String print() {
        return "I m a sphere";
    }
}
