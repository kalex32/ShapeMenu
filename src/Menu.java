import java.util.ArrayList;
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
            switch (scanner.nextInt()) {
                default:
                    break;
                case 1:
                    //Block block = new Block();
                    arrayListsShapes.add(new Block().createShapes());
                    break;
                case 2:
                    //Sphera sphera = new Sphera();
                    arrayListsShapes.add(new Sphere().createShapes());
                    break;
                case 3:
                    //Pyramid pyramid = new Pyramid();
                    arrayListsShapes.add(new Pyramid().createShapes());
                    break;
                case 4:
                    for (Shapes s : arrayListsShapes) System.out.println(s);
                    System.out.println();
                    break;
                    //VerificationOfAmount.verificationOfAmount(arrayListsShapes);
                case 5:
                    System.exit(0);

            }
        }
    }
}


