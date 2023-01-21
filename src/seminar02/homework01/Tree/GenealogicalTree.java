package seminar02.homework01.Tree;

import seminar02.homework01.Human;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Класс генеалогического дерева, который хранит в себе название и массив элементов типа Human
 */
public class GenealogicalTree {
    private String title;
    private ArrayList<Human> humans;

    public GenealogicalTree(String title) {
        this.title = title;
        this.humans = new ArrayList<>();
    }

    /**
     * Функция возвращает строку с this.title
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Функция добавляет объект типа Human в массив this.humans
     * @param fio
     */
    public void setHuman(String fio) {
        this.humans.add(new Human(fio));
    }

    /**
     * Функция добавляет для объекта типа Human по индексу targetHumanIndex в this.humans объект типа Relationships
     * @param targetHumanIndex
     * @param relationship
     * @param humansIndex
     */
    public void setRelationship(int targetHumanIndex, String relationship, int ... humansIndex) {
        ArrayList<Human> humansForRelationship = new ArrayList<>();

        for (int index: humansIndex) {
            if (index < 0 || index > this.humans.size()) {
                System.out.println("Индекс " + index + " отсутствует в дереве");
                return;
            }

            humansForRelationship.add(this.humans.get(index));
        }

        this.humans.get(targetHumanIndex).setRelationship(relationship, humansForRelationship);
    }

    /**
     * Функция возвращает строку, в которой отображены все семейные связи человека из this.humans по указанному индексу
     * @return
     */
    public String getHumanFamilyRelationships(int index) {
        return this.humans.get(index).getAllRelationships();
    }

    /**
     * Функция возвращает строку, в которой отображено все древо (люди и их семейные связи)
     * @return
     */
    public String getAllTree() {
        String result = this.getTitle() + "\n\n";

        for (Human human: this.humans) {
            result += human.getAllRelationships();
        }

        return result;
    }

    /**
     * Функция возвращает строку, в которой отображен тип конкретной семейной связи конкретного человека
     * @param index
     * @param relationshipType
     * @return
     */
    public String getRelationship(int index, String relationshipType) {
        relationshipType = relationshipType.toLowerCase(Locale.ROOT);

        if (index < 0 || index > this.humans.size()) {
            return "Индекс " + index + " отсутствует в дереве";
        }

        return this.humans.get(index).getRelationship(relationshipType);
    }
}