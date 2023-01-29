package seminar02.homework01.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            System.out.println("Person по индексу " + index + " не был найден");
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
