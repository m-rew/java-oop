package seminar04.homework.homework01.GenTree;

import seminar04.homework.homework01.Person.Man;
import seminar04.homework.homework01.Person.Person;
import seminar04.homework.homework01.Person.PersonList;
import seminar04.homework.homework01.Person.Woman;

public class GenTree implements GenTreeService {
    private PersonList personList;

    public GenTree() {
        this.personList = new PersonList();
    }

    /**
     * Метод создает объект типа Man и добавляет его в personList
     * @param name
     * @param televisionPrograms
     */
    @Override
    public void setMan(String name, String televisionPrograms) {
        this.personList.addPerson(new Man(name, televisionPrograms));
    }

    /**
     * Метод создает объект типа Woman и добавляет его в personList
     * @param name
     * @param favoriteFlowers
     */
    @Override
    public void setWoman(String name, String favoriteFlowers) {
        this.personList.addPerson(new Woman(name, favoriteFlowers));
    }

    /**
     * Метод возвращает объект типа Person из personList по индексу
     * @param index
     * @return
     */
    @Override
    public Person getPersonObj(int index) {
        return this.personList.getPersonObj(index);
    }

    /**
     * Метод возвращает строку со структурой дерева для Person по индексу из personList
     * @param index
     * @return
     */
    @Override
    public String getPersonTree(int index) {
        return this.personList.getPersonInfo(index) +
                this.personList.getPersonRelativeList(index);
    }

    /**
     * Метод добавляет семейную связь для targetPerson
     * @param targetPerson
     * @param relativeStr
     * @param addPersonList
     */
    @Override
    public void setRelative(Person targetPerson, String relativeStr, Person... addPersonList) {
        if (targetPerson == null) {
            System.out.println("Связь не добавлена! targetPerson: null");
            return;
        }

        targetPerson.setRelative(relativeStr, addPersonList);
    }
}
