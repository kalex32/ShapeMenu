import java.util.Scanner;

class Block implements Shapes {
    {
        System.out.println("Введите длину, ширину и высоту блока");
    }

    private double lengthBlock;
    private double widthBlock;
    private double heightBlock;


    Block() {
        Scanner scanner = new Scanner(System.in);
        this.lengthBlock = scanner.nextDouble();
        this.widthBlock = scanner.nextDouble();
        this.heightBlock = scanner.nextDouble();
    }

    double getLengthBlock() {
        return lengthBlock;
    }

    double getWidthBlock() {
        return widthBlock;
    }

    double getHeightBlock() {
        return heightBlock;
    }

//    @Override
//    public Sphere createShapes() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите длину, ширину и высоту блока");
//        return new Block(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
//    }

    @Override
    public double volumeShapes() {
        return getLengthBlock() * getWidthBlock() * getLengthBlock();
    }

    @Override
    public double areaOfSurfaceShapes() {
        return (2 * getLengthBlock() * getWidthBlock()) + (2 * getLengthBlock() * getHeightBlock()) +
                (2 * getWidthBlock() * getHeightBlock());
    }
}
