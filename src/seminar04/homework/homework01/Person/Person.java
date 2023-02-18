package seminar04.homework.homework01.Person;

import seminar04.homework.homework01.Relatives.Relative;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements PersonService {
    private String name;
    private List<Relative> relativeList;

    protected Person(String name) {
        this.name = name;
        this.relativeList = new ArrayList<>();
    }

    /**
     * Метод добавляет семейную связь
     * @param relativeStr
     * @param addPersonList
     */
    @Override
    public void setRelative(String relativeStr, Person[] addPersonList) {
        this.relativeList.add(new Relative(relativeStr, addPersonList));
    }

    /**
     * Метод возвращает поле this.name
     * @return
     */
    @Override
    public String getPersonInfo() {
        return this.name;
    }

    /**
     * Метод возвращает строку с семейными связями
     * @return
     */
    @Override
    public String getRelativeList() {
        String result = "";

        for (Relative relative: this.relativeList) {
            result += relative.getAllRelative();
        }

        return result;
    }
}
