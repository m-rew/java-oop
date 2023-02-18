package seminar03.homework02.Animal;

public abstract class Animal implements AnimalService {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract void listen(String words);

    @Override
    public abstract void pet();
}
