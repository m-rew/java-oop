package seminar01.homework01;

import java.util.ArrayList;

/**
 * ��������� ���������
 */
enum typeOfRelationships {
    marriage,       // ����
    parents,        // ��������
    fullRelative,   // ������ / ������
    children,       // ����
}

/**
 * ����� ������������ � �����, ������� ������ � ���� ��� ����� � ������ ��������� ���� Human ������� ��������� � ����� ���� �����
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
     * ������� ���������� ������, � ������� ����������: �������� ����� � ������ ����� this.humans, ������� ��������� � ���� �����
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
