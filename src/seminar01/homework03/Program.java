package seminar01.homework03;

public class Program {
    public static void main(String[] args) {
        Human human1 = new Human("����");
        Human human2 = new Human("�����");

        Cat cat = new Cat("�����", human1);

        human1.callCat(cat, "���-���");
        human1.petCat(cat);
    }
}
