package seminar03.homework01;

import seminar03.homework01.GenTree.GenTree;

public class Program {
    public static void main(String[] args) {
        GenTree tree = new GenTree();

        tree.setMan("������", "������");
        tree.setWoman("�������", "����");
        tree.setMan("����", "�����");

        tree.setRelative(tree.getPersonObj(0), "����", tree.getPersonObj(1));
        tree.setRelative(tree.getPersonObj(0), "������", tree.getPersonObj(2), tree.getPersonObj(1));

        System.out.println(tree.getPersonObj(6));
    }
}
