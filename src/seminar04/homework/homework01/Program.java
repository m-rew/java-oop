package seminar04.homework.homework01;

import seminar04.homework.homework01.GenTree.GenTree;

public class Program {
    public static void main(String[] args) {
        GenTree<String> tree = new GenTree<String>("Древо 1");
        GenTree<Integer> tree2 = new GenTree<Integer>(2);

        System.out.println(tree.getTitle());
        System.out.println(tree2.getTitle());

        System.out.println();

        tree.setMan("Андрей", "Футбол");
        tree.setWoman("Надежда", "Розы");
        tree.setMan("Иван", "Тенис");

        tree.setRelative(tree.getPersonObj(0), "Жена", tree.getPersonObj(1));

        System.out.println(tree.getPersonTree(0));
    }
}
