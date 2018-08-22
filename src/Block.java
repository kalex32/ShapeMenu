import java.util.Scanner;

class Block implements Shapes {
    static {
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

    private double getLengthBlock() {
        return lengthBlock;
    }

    private double getWidthBlock() {
        return widthBlock;
    }

    private double getHeightBlock() {
        return heightBlock;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Блок (");
        sb.append("длина блока = ").append(lengthBlock);
        sb.append(", ширина блока = ").append(widthBlock);
        sb.append(", высота блока =").append(heightBlock);
        sb.append(')' + "\n");
        sb.append("Объем блока = ").append(volumeShapes()).append("\n");
        sb.append("Площадь поверхности блока = ").append(areaOfSurfaceShapes());
        return sb.toString();
    }
}
