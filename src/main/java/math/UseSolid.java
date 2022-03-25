package math;

public class UseSolid {

    public static void main(String[] args) {


        Solid cube = new Cube(3);
        Solid sphere = new Sphere(3);

        System.out.println(cube.surface());
    }
}
