import java.util.Scanner;

class Sphere implements Shapes {
    private double radius;

    private Sphere(double radius) {
        this.radius = radius;
    }

    Sphere() {
    }

    double getRadius() {
        return radius;
    }

    @Override
    public Shapes createShapes() {
        System.out.println("Введите радиус сферы");
        Scanner scanner = new Scanner(System.in);
        return new Sphere(scanner.nextDouble());
    }

    @Override
    public double volumeShapes() {
        return (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public double areaOfSurfaceShapes() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
}
