package seminar04.lesson.Ex002;

public class Program {
    public static void main(String[] args) {
        Gen<String, Integer> gen = new Gen<String, Integer>("����", 2);

        gen.showTypes();

        System.out.println("��� ���� ���� T: " + gen.getObjectUnknownTypeT());
        System.out.println("��� ���� ���� V: " + gen.getObjectUnknownTypeV());
    }
}
