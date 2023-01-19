package seminar01.homework02;

public class Program {
    public static void main(String[] args) {
        Human human = new Human("јндрей");
        Cupboard cupboard = new Cupboard("Ўкаф в спальне");

        human.openCupboard(cupboard);
        human.openCupboard(cupboard);

        human.closeCupboard(cupboard);
        human.closeCupboard(cupboard);
    }
}
