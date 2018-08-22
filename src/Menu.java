import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


class Menu {
    private ArrayList<Shapes> arrayListsShapes = new ArrayList<>();


    void menu() {
        for (; ; ) {
            System.out.println("Сделайте выбор:" + "\n" +
                    "1. Введите блок" + "\n" +
                    "2. Введите сферу" + "\n" +
                    "3. Введите пирамиду" + "\n" +
                    "4. Показать данные" + "\n" +
                    "5. Выход");


            Scanner scanner = new Scanner(System.in);
            try {
                switch (scanner.nextInt()) {
                    default:
                        break;
                    case 1:
                        Block block = new Block();
                        arrayListsShapes.add(block);
                        break;
                    case 2:
                        Shapes sphere = new Sphere();
                        arrayListsShapes.add(sphere);
                        break;
                    case 3:
                        Pyramid pyramid = new Pyramid();
                        arrayListsShapes.add(pyramid);
                        break;
                    case 4:
                        for (Shapes s : arrayListsShapes) System.out.println(s);
                        System.out.println();
                        break;
                    case 5:
                        System.exit(0);

                }
            } catch (InputMismatchException e) {
                menu();
            }
        }
    }
}


