package seminar02.homework01;

import java.util.ArrayList;
import java.util.Locale;

/**
 * ����� ������������ � �����, ������� ������ � ���� ��� ����� � ������ ��������� ���� Human ������� ��������� � ����� ���� �����
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
