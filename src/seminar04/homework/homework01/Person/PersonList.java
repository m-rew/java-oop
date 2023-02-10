package seminar04.homework.homework01.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PersonList implements PersonListService {
    private List<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    /**
     * ����� ��������� ������ ���� Person � ������ personList
     * @param person
     */
    @Override
    public void addPerson(Person person) {
        this.personList.add(person);
    }

    /**
     * ����� ��������� ������ �������� ���� Person � ������ personList
     * @param addPersonList
     */
    @Override
    public void addAllPerson(Person[] addPersonList) {
        this.personList.addAll(Arrays.asList(addPersonList));
    }

    /**
     * ����� ���������� ������ ������ personList �������� ���� Person � �������
     * @param separator
     * @return
     */
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

    /**
     * ����� ���������� ������ ���� Person �� personList �� �������
     * @param index
     * @return
     */
    @Override
    public Person getPersonObj(int index) {
        try {
            return this.personList.get(index);
        } catch (Exception e) {
            Function<Integer, String> convert = x -> "Person �� ������� " + String.valueOf(x) + " �� ��� ������";
            System.out.println(convert.apply(index));
            return null;
        }
    }

    /**
     * ����� ���������� ������ � ������ ������� ���� Person �� personList �� �������
     * @param index
     * @return
     */
    @Override
    public String getPersonInfo(int index) {
        return this.personList.get(index).getPersonInfo();
    }

    /**
     * ����� ���������� ������ � ��������� ������� ������� ���� Person �� personList �� �������
     * @param index
     * @return
     */
    @Override
    public String getPersonRelativeList(int index) {
        return this.personList.get(index).getRelativeList();
    }
}
