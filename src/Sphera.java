import java.util.Scanner;

class Sphera implements Shapes {
    private double radius;

    private Sphera(double radius) {
        this.radius = radius;
    }

    Sphera() {
    }

    double getRadius() {
        return radius;
    }

    @Override
    public Shapes createShapes() {
        System.out.println("Введите радиус сферы");
        Scanner scanner = new Scanner(System.in);
        return new Sphera(scanner.nextDouble());
    }

    @Override
    public double volumeShapes() {
        return (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }
}
