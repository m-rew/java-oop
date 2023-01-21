package seminar02.homework01;

import seminar02.homework01.Tree.GenealogicalTree;

public class Program {
    public static void main(String[] args) {
        GenealogicalTree tree = new GenealogicalTree("��������������� ������ #1");

        tree.setHuman("���� ������");
        tree.setHuman("����� �������");

        tree.setHuman("����� ������");
        tree.setHuman("���� �������");
        tree.setHuman("��������� �������");

        tree.setRelationship(0, "����", 1); // ��������� ��� ���� ������ �����: � ����� � ����� �������
        tree.setRelationship(1, "����", 0); // ��������� ��� ����� ������� �����: � ����� � ���� ������

        tree.setRelationship(0, "����", 2, 3, 4); // ��������� ��� ���� ������ �����: ���� ����� ������, ���� �������, ��������� �������
        tree.setRelationship(1, "����", 2, 3, 4); // ��������� ��� ����� ������� �����: ���� ����� ������, ���� �������, ��������� �������

        tree.setRelationship(2, "������ / ������", 3, 4); // ��������� ��� ����� ������ �����: ������������ ������������ ���� �������, ��������� �������
        tree.setRelationship(2, "��������", 0, 1); // ��������� ��� ����� ������ �����: �������� ���� ������, ����� �������

        tree.setRelationship(3, "������ / ������", 2, 4);
        tree.setRelationship(3, "��������", 0, 1);

        tree.setRelationship(4, "������ / ������", 2, 3);
        tree.setRelationship(4, "��������", 0, 1);

        System.out.println(tree.getRelationship(2, "������ / ������")); // ������� ������� � ������ �������� �� ������� 2 � ������� tree.humans
        // System.out.println(tree.getAllTree()); // ������� ��� ������
    }
}
