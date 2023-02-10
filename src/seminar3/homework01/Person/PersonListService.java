package seminar3.homework01.Person;

public interface PersonListService {
    void addPerson(Person person);
    void addAllPerson(Person[] addPersonList);
    String getAllPerson(String separator);
    Person getPersonObj(int index);
    String getPersonInfo(int index);
    String getPersonRelativeList(int index);
}
