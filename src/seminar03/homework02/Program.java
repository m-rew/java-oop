package seminar03.homework02;

import seminar03.homework02.Animal.Cat;
import seminar03.homework02.Animal.Hamster;
import seminar03.homework02.Human.Human;

import java.util.Scanner;
import java.util.function.Supplier;

public class Program {
    public static void main(String[] args) {
        Supplier<Cat> catFactory = ()->{
            Scanner in = new Scanner(System.in);
            System.out.println("¬ведите им€ котика: ");
            String name = in.nextLine();
            return new Cat(name);
        };

        Supplier<Hamster> hamsterFactory = ()->{
            Scanner in = new Scanner(System.in);
            System.out.println("¬ведите им€ хом€чка: ");
            String name = in.nextLine();
            return new Hamster(name);
        };

        Human human1 = new Human("»ван");

        Cat cat = catFactory.get();
        Hamster hamster = hamsterFactory.get();

        human1.callAnimal(cat, "кис-кис");
        human1.petAnimal(cat);

        human1.callAnimal(hamster, "фр-фр-фр");
        human1.petAnimal(hamster);
    }
}
