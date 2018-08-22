import java.util.Scanner;

class Sphere implements Shapes {
    static {
        System.out.println("Введите радиус сферы");
    }

    private double radius;

    Sphere() {
        Scanner scanner = new Scanner(System.in);
        this.radius = scanner.nextDouble();
    }


    private double getRadius() {
        return radius;
    }


    @Override
    public double volumeShapes() {
        return 1.333333333333333333333 * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public double areaOfSurfaceShapes() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Сфера (");
        sb.append("радиус = ").append(radius);
        sb.append(")" + "\n");
        sb.append("Объем сферы = ").append(volumeShapes()).append("\n");
        sb.append("Площадь поверхности сферы = ").append(areaOfSurfaceShapes());
        return sb.toString();
    }
}
