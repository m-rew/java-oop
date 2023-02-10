package seminar04.homework.homework01.Relatives;

import seminar04.homework.homework01.Person.Person;
import seminar04.homework.homework01.Person.PersonList;

public class Relative implements RelativeService {
    private PersonList personList;
    private String rank;

    public Relative(String rank, Person[] addPersonList) {
        this.rank = rank;
        this.personList = new PersonList();
        this.personList.addAllPerson(addPersonList);
    }

    /**
     * Метод возвращает строку с названием семейной связи и списком объектов типа Person
     * @return
     */
    public String getAllRelative() {
        return "\n    " + this.rank + ": " + this.personList.getAllPerson(",");
    }
}
