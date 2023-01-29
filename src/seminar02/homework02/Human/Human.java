package seminar02.homework02.Human;

import seminar02.homework02.Animal.Animal;
import seminar02.homework02.Animal.Cat;

public class Human implements HumanService {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void callAnimal(Animal animal, String words) {
        animal.listen(words);
    }

    public void petAnimal(Animal animal) {
        animal.pet();
    }
}
