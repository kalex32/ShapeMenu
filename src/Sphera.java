import java.util.Scanner;

class Sphera {
    private double radius;

    private Sphera(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    static Object sphera(){
        System.out.println("Введите радиус сферы");
        Scanner scanner = new Scanner(System.in);
        return new Sphera(scanner.nextDouble());
    }
}
