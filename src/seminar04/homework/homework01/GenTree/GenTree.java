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
     * ����� ������� ������ ���� Man � ��������� ��� � personList
     * @param name
     * @param televisionPrograms
     */
    @Override
    public void setMan(String name, String televisionPrograms) {
        this.personList.addPerson(new Man(name, televisionPrograms));
    }

    /**
     * ����� ������� ������ ���� Woman � ��������� ��� � personList
     * @param name
     * @param favoriteFlowers
     */
    @Override
    public void setWoman(String name, String favoriteFlowers) {
        this.personList.addPerson(new Woman(name, favoriteFlowers));
    }

    /**
     * ����� ���������� ������ ���� Person �� personList �� �������
     * @param index
     * @return
     */
    @Override
    public Person getPersonObj(int index) {
        return this.personList.getPersonObj(index);
    }

    /**
     * ����� ���������� ������ �� ���������� ������ ��� Person �� ������� �� personList
     * @param index
     * @return
     */
    @Override
    public String getPersonTree(int index) {
        return this.personList.getPersonInfo(index) +
                this.personList.getPersonRelativeList(index);
    }

    /**
     * ����� ��������� �������� ����� ��� targetPerson
     * @param targetPerson
     * @param relativeStr
     * @param addPersonList
     */
    @Override
    public void setRelative(Person targetPerson, String relativeStr, Person... addPersonList) {
        if (targetPerson == null) {
            System.out.println("����� �� ���������! targetPerson: null");
            return;
        }

        targetPerson.setRelative(relativeStr, addPersonList);
    }
}
