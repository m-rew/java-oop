package seminar01.homework01;

public class Program {
    public static void main(String[] args) {
        GenealogicalTree tree = new GenealogicalTree("��������������� ������ #1");

        tree.setHuman("���� ������");
        tree.setHuman("����� �������");
        tree.setRelationship(0, typeOfRelationships.marriage, 1); // ��������� ��� ���� ������ �����: � ����� � ����� �������
        tree.setRelationship(1, typeOfRelationships.marriage, 0); // ��������� ��� ����� ������� �����: � ����� � ���� ������

        tree.setHuman("����� ������");
        tree.setHuman("���� �������");
        tree.setHuman("��������� �������");
        tree.setRelationship(0, typeOfRelationships.children, 2, 3, 4); // ��������� ��� ���� ������ �����: ���� ����� ������, ���� �������, ��������� �������
        tree.setRelationship(1, typeOfRelationships.children, 2, 3, 4); // ��������� ��� ����� ������� �����: ���� ����� ������, ���� �������, ��������� �������

        tree.setRelationship(2, typeOfRelationships.fullRelative, 3, 4); // ��������� ��� ����� ������ �����: ������������ ������������ ���� �������, ��������� �������
        tree.setRelationship(2, typeOfRelationships.parents, 0, 1); // ��������� ��� ����� ������ �����: �������� ���� ������, ����� �������

        tree.setRelationship(3, typeOfRelationships.fullRelative, 2, 4);
        tree.setRelationship(3, typeOfRelationships.parents, 0, 1);

        tree.setRelationship(4, typeOfRelationships.fullRelative, 2, 3);
        tree.setRelationship(4, typeOfRelationships.parents, 0, 1);

        System.out.println(tree.getRelationship(2, typeOfRelationships.fullRelative)); // ������� ������� � ������ �������� �� ������� 2 � ������� tree.humans
        // System.out.println(tree.getAllTree()); // ������� ��� ������
    }
}
