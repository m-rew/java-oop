package seminar3.homework01.Person;

import seminar3.homework01.Relatives.Relative;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements PersonService {
    private String name;
    private List<Relative> relativeList;

    protected Person(String name) {
        this.name = name;
        this.relativeList = new ArrayList<>();
    }

    @Override
    public void setRelative(String relativeStr, Person[] addPersonList) {
        this.relativeList.add(new Relative(relativeStr, addPersonList));
    }

    @Override
    public String getPersonInfo() {
        return this.name;
    }

    @Override
    public String getRelativeList() {
        String result = "";

        for (Relative relative: this.relativeList) {
            result += relative.getAllRelative();
        }

        return result;
    }
}
