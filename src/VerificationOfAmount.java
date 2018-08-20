import java.util.ArrayList;
import java.util.Scanner;

class VerificationOfAmount extends Menu{

    static void verificationOfAmount(ArrayList arrayListShapes) {
        while (arrayListShapes.size() < 10) {
            System.out.println("Желаете добавить фигуру?" + "\n" +
                    "1.       Да" + "\n" +
                    "Anykey. Нет");
            Scanner scanner = new Scanner(System.in);
            Menu menu = new Menu();
            if (scanner.nextInt() == 1) menu.menu();
            else break;
        }
    }
}
