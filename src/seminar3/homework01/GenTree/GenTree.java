package seminar3.homework01.GenTree;

import seminar3.homework01.Person.Man;
import seminar3.homework01.Person.Person;
import seminar3.homework01.Person.PersonList;
import seminar3.homework01.Person.Woman;

public class GenTree implements GenTreeService {
    private PersonList personList;

    public GenTree() {
        this.personList = new PersonList();
    }

    @Override
    public void setMan(String name, String televisionPrograms) {
        this.personList.addPerson(new Man(name, televisionPrograms));
    }

    @Override
    public void setWoman(String name, String favoriteFlowers) {
        this.personList.addPerson(new Woman(name, favoriteFlowers));
    }

    @Override
    public Person getPersonObj(int index) {
        return this.personList.getPersonObj(index);
    }

    @Override
    public String getPersonTree(int index) {
        return this.personList.getPersonInfo(index) +
                this.personList.getPersonRelativeList(index);
    }

    @Override
    public String getGenTree() {
        return null;
    }

    @Override
    public void setRelative(Person targetPerson, String relativeStr, Person... addPersonList) {
        if (targetPerson == null) {
            System.out.println("Связь не добавлена! targetPerson: null");
            return;
        }

        targetPerson.setRelative(relativeStr, addPersonList);
    }
}
