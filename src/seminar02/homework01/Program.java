package seminar02.homework01;

import seminar02.homework01.Tree.GenealogicalTree;

public class Program {
    public static void main(String[] args) {
        GenealogicalTree tree = new GenealogicalTree("Генеалогическое дерево #1");

        tree.setHuman("Иван Иванов");
        tree.setHuman("Арина Иванова");

        tree.setHuman("Павел Иванов");
        tree.setHuman("Анна Иванова");
        tree.setHuman("Екатерина Иванова");

        tree.setRelationship(0, "Брак", 1); // Добавляем для Иван Иванов связь: в браке с Арина Иванова
        tree.setRelationship(1, "Брак", 0); // Добавляем для Арина Иванова связь: в браке с Иван Иванов

        tree.setRelationship(0, "Дети", 2, 3, 4); // Добавляем для Иван Иванов связь: дети Павел Иванов, Анна Иванова, Екатерина Иванова
        tree.setRelationship(1, "Дети", 2, 3, 4); // Добавляем для Арина Иванова связь: дети Павел Иванов, Анна Иванова, Екатерина Иванова

        tree.setRelationship(2, "Братья / Сестры", 3, 4); // Добавляем для Павел Иванов связь: полнокровные родственники Анна Иванова, Екатерина Иванова
        tree.setRelationship(2, "Родители", 0, 1); // Добавляем для Павел Иванов связь: родители Иван Иванов, Арина Иванова

        tree.setRelationship(3, "Братья / Сестры", 2, 4);
        tree.setRelationship(3, "Родители", 0, 1);

        tree.setRelationship(4, "Братья / Сестры", 2, 3);
        tree.setRelationship(4, "Родители", 0, 1);

        System.out.println(tree.getRelationship(2, "Братья / Сестры")); // Выведет братьев и сестер человека по индексу 2 в массиве tree.humans
        // System.out.println(tree.getAllTree()); // Выведет все дерево
    }
}
