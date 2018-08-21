import java.util.Scanner;

class Sphere implements Shapes {
    {
        System.out.println("Введите радиус сферы");
    }

    private double radius;

    Sphere() {
        Scanner scanner = new Scanner(System.in);
        this.radius = scanner.nextDouble();
    }


    double getRadius() {
        return radius;
    }

//    @Override
//    public Sphere createShapes() {
//        System.out.println("Введите радиус сферы");
//        Scanner scanner = new Scanner(System.in);
//        return new Sphere(scanner.nextDouble());
//    }

    @Override
    public double volumeShapes() {
        return (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public double areaOfSurfaceShapes() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
}
