package lecture05.Ex002;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.print(
                    "1. Показать контакты\n" +
                    "2. Создать контакт\n" +
                    "3. Удалить контакт\n" +
                    "4. Обновить контакт\n" +
                    "5. Выход\n" +
                    "Введите пункт меню: "
        );
    }

    public int eventListener() {
        return scanner.nextInt();
    }

    public String read(String title) {
        System.out.printf("%s: ", title);
        return scanner.next();
    }

    public void print(String title, String data) {
        System.out.printf("%s: %s", title, data);
    }

    public void print(String title) {
        System.out.println(title);
    }
}
