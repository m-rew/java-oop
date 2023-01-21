package seminar02.homework01;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Класс взаимосвязий в семье, который хранит в себе тип связи и массив элементов типа Human которые относятся к этому типу связи
 */
public class Relationships {
    String relationship;
    ArrayList<Human> humans;

    public Relationships(String relationship, ArrayList<Human> humansForRelationship) {
        this.relationship = relationship.toLowerCase(Locale.ROOT);
        this.humans = new ArrayList<>();
        this.humans.addAll(humansForRelationship);
    }

    public String getRelationshipType() {
        return this.relationship;
    }

    /**
     * Функция возвращает строку, в которой отображены: название связи и массив людей this.humans, которые относятся к этой связи
     * @return
     */
    public String getInfo() {
        String result = "    " + this.relationship + "\n";

        for (Human human: humans) {
            result += "        " + human.getFio() + "\n";
        }

        return result;
    }
}
