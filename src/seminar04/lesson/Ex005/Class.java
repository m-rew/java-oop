package seminar04.lesson.Ex005;

public class Class {
    private int sum;

    <T extends Number> Class(T arg) {
        this.sum = 0;

        for (int i = 0; i <= arg.intValue(); i++) {
            this.sum += i;
        }
    }

    public int getSum() {
        return this.sum;
    }
}
