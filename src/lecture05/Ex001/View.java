package lecture05.Ex001;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return scanner.nextInt();
    }

    public void print(int data, String title) {
        System.out.printf("%s %d", title, data);
    }
}
