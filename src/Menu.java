import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    ArrayList<Object> arrayListsShapes = new ArrayList<>();
    void menu() {
        System.out.println("Сделайте выбор:" + "\n" +
                "1. Введите блок" + "\n" +
                "2. Введите сферу" + "\n" +
                "3. Введите пирамиду" + "\n" +
                "4. Показать данные" + "\n" +
                "5. Выход");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                Block block = new Block();
                arrayListsShapes.add(1, block.createShapes());
                menu();
                break;
            case 2:
                Sphera sphera = new Sphera();
                sphera.createShapes();
                break;
            case 3:
                Pyramid pyramid = new Pyramid();
                pyramid.createShapes();
                break;
        }
        scanner.close();
    }

}


