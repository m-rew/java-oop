package seminar01.homework01;

import java.util.ArrayList;

/**
 * Категории отношений
 */
enum typeOfRelationships {
    marriage,       // Брак
    parents,        // Родители
    fullRelative,   // Братья / Сестры
    children,       // Дети
}

/**
 * Класс взаимосвязий в семье, который хранит в себе тип связи и массив элементов типа Human которые относятся к этому типу связи
 */
public class Relationships {
    typeOfRelationships relationship;
    ArrayList<Human> humans;

    public Relationships(typeOfRelationships relationship, ArrayList<Human> humansForRelationship) {
        this.relationship = relationship;
        this.humans = new ArrayList<>();
        this.humans.addAll(humansForRelationship);
    }

    public typeOfRelationships getRelationshipType() {
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
