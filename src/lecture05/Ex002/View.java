package lecture05.Ex002;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.print(
                    "1. �������� ��������\n" +
                    "2. ������� �������\n" +
                    "3. ������� �������\n" +
                    "4. �������� �������\n" +
                    "5. �����\n" +
                    "������� ����� ����: "
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