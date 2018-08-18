import java.util.Scanner;

class Pyramid implements Shapes {
    private double lengthPyramid;
    private double widthPyramid;
    private double heightPyramid;

    Pyramid(double lengthPyramid, double widthPyramid, double heightPyramid) {
        this.lengthPyramid = lengthPyramid;
        this.widthPyramid = widthPyramid;
        this.heightPyramid = heightPyramid;
    }

    Pyramid() {
    }

    double getLengthPyramid() {
        return lengthPyramid;
    }

    double getWidthPyramid() {
        return widthPyramid;
    }

    double getHeightPyramid() {
        return heightPyramid;
    }

    @Override
    public Shapes createShapes() {
        System.out.println("Введите длину и ширину основания пирамиды, а также высоту");
        Scanner scanner = new Scanner(System.in);
        return new Pyramid(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }

    @Override
    public double volumeShapes() {
        return (1/3)*getLengthPyramid()*getWidthPyramid()*getHeightPyramid();
    }
}
