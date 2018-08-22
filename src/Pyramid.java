import java.util.Scanner;

class Pyramid implements Shapes {
    static {
        System.out.println("Введите длину и ширину основания пирамиды, а также высоту");
    }

    private double lengthPyramid;
    private double widthPyramid;
    private double heightPyramid;


    Pyramid() {
        Scanner scanner = new Scanner(System.in);
        this.lengthPyramid = scanner.nextDouble();
        this.widthPyramid = scanner.nextDouble();
        this.heightPyramid = scanner.nextDouble();
    }


    private double getLengthPyramid() {
        return lengthPyramid;
    }

    private double getWidthPyramid() {
        return widthPyramid;
    }

    private double getHeightPyramid() {
        return heightPyramid;
    }


    @Override
    public double volumeShapes() {
        return 0.333333333333333333 * getLengthPyramid() * getWidthPyramid() * getHeightPyramid();
    }

    @Override
    public double areaOfSurfaceShapes() {
        return (getLengthPyramid() * getWidthPyramid()) + ((Math.sqrt(Math.pow(getHeightPyramid(), 2) +
                Math.pow(getLengthPyramid() / 2, 2)) * getWidthPyramid())) +
                ((Math.sqrt(Math.pow(getHeightPyramid(), 2) +
                        Math.pow(getWidthPyramid() / 2, 2)) * getLengthPyramid()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Пирамида (");
        sb.append("длина основания пирамиды = ").append(lengthPyramid);
        sb.append(", ширина основания пирамиды=").append(widthPyramid);
        sb.append(", высота пирамиды=").append(heightPyramid);
        sb.append(')' + "\n");
        sb.append("Объем пирамиды = ").append(volumeShapes()).append("\n");
        sb.append("Площадь поверхности пирамиды = ").append(areaOfSurfaceShapes());
        return sb.toString();
    }
}
