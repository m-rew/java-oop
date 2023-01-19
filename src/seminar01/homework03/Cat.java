package seminar01.homework03;

import java.util.Locale;

public class Cat {
    private String name;

    public Cat(String name, Human ... owners) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void listen(String words) {
        if (words.toLowerCase().equals("���-���")) {
            System.out.println(this.getName() + ": " + "���");
        }
    }

    public void purr() {
        System.out.println(this.getName() + ": " + "\"������\"");
    }

}
