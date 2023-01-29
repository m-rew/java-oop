package seminar02.homework02.Animal;

import seminar02.homework02.Human.Human;

import java.util.List;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void listen(String words) {
        if (words.toLowerCase().equals("кис-кис")) {
            System.out.println(this.getName() + ": " + "м€у");
        }
    }

    @Override
    public void pet() {
        System.out.println(this.getName() + ": " + "\"ћурчит\"");
    }
}
