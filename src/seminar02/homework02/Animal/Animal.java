package seminar02.homework02.Animal;

import seminar02.homework02.Human.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
