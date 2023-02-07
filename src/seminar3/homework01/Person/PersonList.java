package seminar3.homework01.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PersonList implements PersonListService {
    private List<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        this.personList.add(person);
    }

    @Override
    public void addAllPerson(Person[] addPersonList) {
        this.personList.addAll(Arrays.asList(addPersonList));
    }

    @Override
    public String getAllPerson(String separator) {
        String result = "";

        for (int i = 0; i < this.personList.size(); i++) {
            if (i != this.personList.size() - 1) {
                result += this.personList.get(i).getPersonInfo() + separator + " ";
            } else {
                result += this.personList.get(i).getPersonInfo();
            }
        }

        return result;
    }

    @Override
    public Person getPersonObj(int index) {
        try {
            return this.personList.get(index);
        } catch (Exception e) {
            Function<Integer, String> convert = x -> "Person по индексу " + String.valueOf(x) + " не был найден";
            System.out.println(convert.apply(index));
            return null;
        }
    }

    @Override
    public String getPersonInfo(int index) {
        return this.personList.get(index).getPersonInfo();
    }

    @Override
    public String getPersonRelativeList(int index) {
        return this.personList.get(index).getRelativeList();
    }
}
