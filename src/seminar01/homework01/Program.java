package seminar01.homework01;

public class Program {
    public static void main(String[] args) {
        GenealogicalTree tree = new GenealogicalTree("Генеалогическое дерево #1");

        tree.setHuman("Иван Иванов");
        tree.setHuman("Арина Иванова");
        tree.setRelationship(0, typeOfRelationships.marriage, 1); // Добавляем для Иван Иванов связь: в браке с Арина Иванова
        tree.setRelationship(1, typeOfRelationships.marriage, 0); // Добавляем для Арина Иванова связь: в браке с Иван Иванов

        tree.setHuman("Павел Иванов");
        tree.setHuman("Анна Иванова");
        tree.setHuman("Екатерина Иванова");
        tree.setRelationship(0, typeOfRelationships.children, 2, 3, 4); // Добавляем для Иван Иванов связь: дети Павел Иванов, Анна Иванова, Екатерина Иванова
        tree.setRelationship(1, typeOfRelationships.children, 2, 3, 4); // Добавляем для Арина Иванова связь: дети Павел Иванов, Анна Иванова, Екатерина Иванова

        tree.setRelationship(2, typeOfRelationships.fullRelative, 3, 4); // Добавляем для Павел Иванов связь: полнокровные родственники Анна Иванова, Екатерина Иванова
        tree.setRelationship(2, typeOfRelationships.parents, 0, 1); // Добавляем для Павел Иванов связь: родители Иван Иванов, Арина Иванова

        tree.setRelationship(3, typeOfRelationships.fullRelative, 2, 4);
        tree.setRelationship(3, typeOfRelationships.parents, 0, 1);

        tree.setRelationship(4, typeOfRelationships.fullRelative, 2, 3);
        tree.setRelationship(4, typeOfRelationships.parents, 0, 1);

        System.out.println(tree.getRelationship(2, typeOfRelationships.fullRelative)); // Выведет братьев и сестер человека по индексу 2 в массиве tree.humans
        // System.out.println(tree.getAllTree()); // Выведет все дерево
    }
}
