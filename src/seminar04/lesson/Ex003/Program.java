package seminar04.lesson.Ex003;

public class Program {
    public static void main(String[] args) {
        Numeric<Double> numeric = new Numeric<>(6.1);

        System.out.println("�������� �������� numeric.num: " + numeric.getRec());
        System.out.println("������� ����� numeric.num: " + numeric.getFrac());
    }
}
