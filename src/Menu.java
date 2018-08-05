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
                case 1:
                    // Перенести в отдельный метод в класс Блок
                    //System.out.println("Введите длину, ширину и высоту блока");
                    //Block block = new Block(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            }
        } catch (ArrayStoreException e){
            menu();
        }

    }
}