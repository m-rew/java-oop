package seminar02.homework02.Relatives;

import seminar02.homework02.Person.Person;
import seminar02.homework02.Person.PersonList;

public class Relative implements RelativeService {
    private PersonList personList;
    private String rank;

    public Relative(String rank, Person[] addPersonList) {
        this.rank = rank;
        this.personList = new PersonList();
        this.personList.addAllPerson(addPersonList);
    }

    public String getAllRelative() {
        return "\n    " + this.rank + ": " + this.personList.getAllPerson(",");
    }
}
