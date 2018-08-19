import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    private ArrayList<Shapes> arrayListsShapes = new ArrayList<>();

    private void verificationOfAmount(ArrayList arrayListShapes) {
        while (arrayListShapes.size() < 10) {
            System.out.println("Желаете добавить фигуру?" + "\n" +
                    "1.       Да" + "\n" +
                    "Anykey. Нет");
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == 1) menu();
            else break;
        }
    }

    void menu() {
        //if (arrayListsShapes.size() < 10) {
        System.out.println("Сделайте выбор:" + "\n" +
                "1. Введите блок" + "\n" +
                "2. Введите сферу" + "\n" +
                "3. Введите пирамиду" + "\n" +
                "4. Показать данные" + "\n" +
                "5. Выход");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            default:
                verificationOfAmount(arrayListsShapes);
            case 1:
                //Block block = new Block();
                arrayListsShapes.add(new Block().createShapes());
                verificationOfAmount(arrayListsShapes);
            case 2:
                //Sphera sphera = new Sphera();
                arrayListsShapes.add(new Sphera().createShapes());
                verificationOfAmount(arrayListsShapes);
            case 3:
                //Pyramid pyramid = new Pyramid();
                arrayListsShapes.add(new Pyramid().createShapes());
                verificationOfAmount(arrayListsShapes);
            case 4:
                for (Shapes s : arrayListsShapes) System.out.println(s);
                System.out.println();
                verificationOfAmount(arrayListsShapes);
            case 5:
                break;
        }

    }
}


