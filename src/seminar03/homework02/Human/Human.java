package seminar03.homework02.Human;

import seminar03.homework02.Animal.Animal;

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
