package seminar02.homework01;

import java.util.ArrayList;

/**
 * Класс человека, который хранит в себе фио и массив элементов типа Relationships
 */
public class Human {
    private String fio;
    private ArrayList<Relationships> relationships;

    public Human(String fio) {
        this.fio = fio;
        this.relationships = new ArrayList<>();
    }

    public String getFio() {
        return this.fio;
    }

    /**
     * Функция добавляет в массив this.relationships орбъект типа Relationships
     * @param relationship
     * @param humansForRelationship
     */
    public void setRelationship(String relationship, ArrayList<Human> humansForRelationship) {
        this.relationships.add(new Relationships(relationship, humansForRelationship));
    }

    /**
     * Функция возвращает строку, в которой отображены семейные связи человека, хранящиеся в массиве this.relationships
     * @return
     */
    public String getAllRelationships() {
        String result = this.fio + "\n";

        for (Relationships relationship: this.relationships) {
            result += relationship.getInfo();
        }

        return result;
    }

    public String getRelationship(String relationshipType) {
        String result = this.fio + "\n";

        for (Relationships relationship: this.relationships) {
            if (relationship.getRelationshipType().equals(relationshipType)) {
                result += relationship.getInfo();
            }
        }

        return result;
    }
}
