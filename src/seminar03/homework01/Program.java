package seminar03.homework01;

import seminar03.homework01.GenTree.GenTree;

public class Program {
    public static void main(String[] args) {
        GenTree tree = new GenTree();

        tree.setMan("Андрей", "Футбол");
        tree.setWoman("Надежда", "Розы");
        tree.setMan("Иван", "Тенис");

        tree.setRelative(tree.getPersonObj(0), "Жена", tree.getPersonObj(1));
        tree.setRelative(tree.getPersonObj(0), "Друзья", tree.getPersonObj(2), tree.getPersonObj(1));

        System.out.println(tree.getPersonObj(6));
    }
}
