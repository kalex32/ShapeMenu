import java.util.Scanner;

class Block {
    private double lengthBlock;
    private double widthBlock;
    private double heightBlock;

    private Block(double lengthBlock, double widthBlock, double heightBlock) {
        this.lengthBlock = lengthBlock;
        this.widthBlock = widthBlock;
        this.heightBlock = heightBlock;
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

    static Object block() {
        System.out.println("Введите длину, ширину и высоту блока");
        Scanner scanner = new Scanner(System.in);
        return new Block(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }
}
