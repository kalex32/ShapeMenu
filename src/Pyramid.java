import java.util.Scanner;

class Pyramid {
    private double lengthPyramid;
    private double widthPyramid;
    private double heightPyramid;

    Pyramid(double lengthPyramid, double widthPyramid, double heightPyramid) {
        this.lengthPyramid = lengthPyramid;
        this.widthPyramid = widthPyramid;
        this.heightPyramid = heightPyramid;
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

    static Object pyramid(){
        System.out.println("Введите длину и ширину основания пирамиды, а также высоту");
        Scanner scanner = new Scanner(System.in);
        return new Pyramid(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }
}
