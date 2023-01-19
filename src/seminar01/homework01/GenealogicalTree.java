package seminar01.homework01;

import java.util.ArrayList;

/**
 * ����� ���������������� ������, ������� ������ � ���� �������� � ������ ��������� ���� Human
 */
public class GenealogicalTree {
    private String title;
    private ArrayList<Human> humans;

    public GenealogicalTree(String title) {
        this.title = title;
        this.humans = new ArrayList<>();
    }

    /**
     * ������� ���������� ������ � this.title
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * ������� ��������� ������ ���� Human � ������ this.humans
     * @param fio
     */
    public void setHuman(String fio) {
        this.humans.add(new Human(fio));
    }

    /**
     * ������� ��������� ��� ������� ���� Human �� ������� targetHumanIndex � this.humans ������ ���� Relationships
     * @param targetHumanIndex
     * @param relationship
     * @param humansIndex
     */
    public void setRelationship(int targetHumanIndex, typeOfRelationships relationship, int ... humansIndex) {
        ArrayList<Human> humansForRelationship = new ArrayList<>();

        for (int index: humansIndex) {
            if (index < 0 || index > this.humans.size()) {
                System.out.println("������ " + index + " ����������� � ������");
                return;
            }

            humansForRelationship.add(this.humans.get(index));
        }

        this.humans.get(targetHumanIndex).setRelationship(relationship, humansForRelationship);
    }

    /**
     * ������� ���������� ������, � ������� ���������� ��� �������� ����� �������� �� this.humans �� ���������� �������
     * @return
     */
    public String getHumanFamilyRelationships(int index) {
        return this.humans.get(index).getAllRelationships();
    }

    public String getAllTree() {
        String result = this.getTitle() + "\n\n";

        for (Human human: this.humans) {
            result += human.getAllRelationships();
        }

        return result;
    }

    public String getRelationship(int index, typeOfRelationships relationshipType) {
        if (index < 0 || index > this.humans.size()) {
            return "������ " + index + " ����������� � ������";
        }

        return this.humans.get(index).getRelationship(relationshipType);
    }
}