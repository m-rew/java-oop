package seminar04.lesson.Ex002;

public class Program {
    public static void main(String[] args) {
        Gen<String, Integer> gen = new Gen<String, Integer>("Вася", 2);

        gen.showTypes();

        System.out.println("Тип поля типа T: " + gen.getObjectUnknownTypeT());
        System.out.println("Тип поля типа V: " + gen.getObjectUnknownTypeV());
    }
}
