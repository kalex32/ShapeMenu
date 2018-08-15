import java.util.Scanner;

class Block {
    private double length;
    private double width;
    private double height;

    private Block(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    static Object block() {
        System.out.println("Введите длину, ширину и высоту блока");
        Scanner scanner = new Scanner(System.in);
        return new Block(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }
}
