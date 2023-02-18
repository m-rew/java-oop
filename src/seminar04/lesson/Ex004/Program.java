package seminar04.lesson.Ex004;

public class Program {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};

        Class<Integer> class1 = new Class<>(array);

        if (class1.contains(2)) {
            System.out.println("2 входит в class1.array");
        } else {
            System.out.println("2 не входит в class1.array");
        }
    }
}
