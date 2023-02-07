package seminar3.homework02;

import seminar3.homework02.Animal.Cat;
import seminar3.homework02.Animal.Hamster;
import seminar3.homework02.Human.Human;

public class Program {
    public static void main(String[] args) {
        Human human1 = new Human("Иван");

        Cat cat = new Cat("Рыжик");
        Hamster hamster = new Hamster("Хома");

        human1.callAnimal(cat, "кис-кис");
        human1.petAnimal(cat);

        human1.callAnimal(hamster, "фр-фр-фр");
        human1.petAnimal(hamster);

    }
}
