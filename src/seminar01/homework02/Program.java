package seminar01.homework02;

public class Program {
    public static void main(String[] args) {
        Human human = new Human("������");
        Cupboard cupboard = new Cupboard("���� � �������");

        human.openCupboard(cupboard);
        human.openCupboard(cupboard);

        human.closeCupboard(cupboard);
        human.closeCupboard(cupboard);
    }
}
