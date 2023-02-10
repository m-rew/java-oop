package seminar04.homework.homework01.GenTree;

import seminar04.homework.homework01.Person.Person;

public interface GenTreeService {
    void setMan(String name, String televisionPrograms);
    void setWoman(String name, String favoriteFlowers);
    Person getPersonObj(int index);
    String getPersonTree(int index);
    void setRelative(Person targetPerson, String relativeStr, Person... addPersonList);
}
