import java.util.Scanner;

class Block extends Menu implements Shapes {
    private double lengthBlock;
    private double widthBlock;
    private double heightBlock;

    private Block(double lengthBlock, double widthBlock, double heightBlock) {
        this.lengthBlock = lengthBlock;
        this.widthBlock = widthBlock;
        this.heightBlock = heightBlock;
    }

    Block() {
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

    @Override
    public Shapes createShapes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину, ширину и высоту блока");
        return new Block(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }

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
