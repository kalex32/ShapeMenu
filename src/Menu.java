import java.util.Scanner;

class Menu {
    void menu() {
        System.out.println("Сделайте выбор:" + "\n" +
                "1. Введите блок" + "\n" +
                "2. Введите сферу" + "\n" +
                "3. Введите пирамиду" + "\n" +
                "4. Показать данные" + "\n" +
                "5. Выход");

        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.nextInt()) {
                case 1: Block.block();
                case 2: Sphera.sphera();
                case 3: Pyramid.pyramid();
            }
        } catch (ArrayStoreException e){
            menu();
        }

    }
}