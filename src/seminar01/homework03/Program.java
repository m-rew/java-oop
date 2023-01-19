package seminar01.homework03;

public class Program {
    public static void main(String[] args) {
        Human human1 = new Human("Иван");
        Human human2 = new Human("Артем");

        Cat cat = new Cat("Рыжик", human1);

        human1.callCat(cat, "кис-кис");
        human1.petCat(cat);
    }
}
