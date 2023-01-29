package seminar02.homework01.GenTree;

import seminar02.homework01.Person.Person;

public interface GenTreeService {
    void setMan(String name, String televisionPrograms);
    void setWoman(String name, String favoriteFlowers);
    Person getPersonObj(int index);
    String getPersonTree(int index);
    String getGenTree();
    void setRelative(Person targetPerson, String relativeStr, Person ... addPersonList);
}
