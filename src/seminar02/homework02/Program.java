package seminar02.homework02;

import seminar02.homework02.Animal.Cat;
import seminar02.homework02.Animal.Hamster;
import seminar02.homework02.Human.Human;

public class Program {
    public static void main(String[] args) {
        Human human1 = new Human("����");

        Cat cat = new Cat("�����");
        Hamster hamster = new Hamster("����");

        human1.callAnimal(cat, "���-���");
        human1.petAnimal(cat);

        human1.callAnimal(hamster, "��-��-��");
        human1.petAnimal(hamster);

    }
}
