import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    private ArrayList<Shapes> arrayListsShapes = new ArrayList<>();



    void menu() {

        System.out.println("Сделайте выбор:" + "\n" +
                "1. Введите блок" + "\n" +
                "2. Введите сферу" + "\n" +
                "3. Введите пирамиду" + "\n" +
                "4. Показать данные" + "\n" +
                "5. Выход");


        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            default:
                VerificationOfAmount.verificationOfAmount(arrayListsShapes);
            case 1:
                //Block block = new Block();
                arrayListsShapes.add(new Block().createShapes());
                VerificationOfAmount.verificationOfAmount(arrayListsShapes);
            case 2:
                //Sphera sphera = new Sphera();
                arrayListsShapes.add(new Sphera().createShapes());
                VerificationOfAmount.verificationOfAmount(arrayListsShapes);
            case 3:
                //Pyramid pyramid = new Pyramid();
                arrayListsShapes.add(new Pyramid().createShapes());
                VerificationOfAmount.verificationOfAmount(arrayListsShapes);
            case 4:
                for (Shapes s : arrayListsShapes) System.out.println(s);
                System.out.println();
                VerificationOfAmount.verificationOfAmount(arrayListsShapes);
            case 5:
                break;

        }
    }

}


