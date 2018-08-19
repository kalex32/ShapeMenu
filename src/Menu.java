import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Menu {

    static void menu() {
        ArrayList<Shapes> arrayListsShapes = new ArrayList<>();
        //if (arrayListsShapes.size() < 10) {
            System.out.println("Сделайте выбор:" + "\n" +
                    "1. Введите блок" + "\n" +
                    "2. Введите сферу" + "\n" +
                    "3. Введите пирамиду" + "\n" +
                    "4. Показать данные" + "\n" +
                    "5. Выход");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    //Block block = new Block();
                    arrayListsShapes.add(new Block().createShapes());
                    //menu();
                    break;
                case 2:
                    //Sphera sphera = new Sphera();
                    arrayListsShapes.add(new Sphera().createShapes());
                    //menu();
                    break;
                case 3:
                    //Pyramid pyramid = new Pyramid();
                    arrayListsShapes.add(new Pyramid().createShapes());
                    //menu();
                    break;
                case 4:
                    for (Shapes s : arrayListsShapes) System.out.println(s);
                    System.out.println();
                    //menu();
                case 5:
                    break;
                default:
                    //menu();
            }
        //}else return;
        VerificationOfAmount.verificationOfAmount(arrayListsShapes);
    }

}


