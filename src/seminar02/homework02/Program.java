package seminar02.homework02;

import seminar02.homework02.GenTree.GenTree;
import seminar02.homework02.Person.Man;
import seminar02.homework02.Person.Person;

public class Program {
    public static void main(String[] args) {
        GenTree tree = new GenTree();

        tree.setMan("������", "������");
        tree.setWoman("�������", "����");
        tree.setMan("����", "�����");

        tree.setRelative(tree.getPersonObj(0), "����", tree.getPersonObj(1));
        tree.setRelative(tree.getPersonObj(0), "������", tree.getPersonObj(2), tree.getPersonObj(1));

        System.out.println(tree.getPersonTree(0));
    }
}
