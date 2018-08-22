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
                        double v = 0;
                        double s = 0;
                        for (Shapes i : arrayListsShapes) {
                            System.out.println(i.toString());
                            System.out.println();
                            v+=i.volumeShapes();
                            s+=i.areaOfSurfaceShapes();
                        }
                        System.out.println("Средний объем всех фигур = "+v/arrayListsShapes.size());
                        System.out.println("Средняя площадь поверхностей фигур = "+s/arrayListsShapes.size());
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


