package seminar04.lesson.Ex003;

public class Numeric<T extends Number> {
    T num;

    Numeric(T num) {
        this.num = num;
    }

    public double getRec() {
        return 1 / this.num.doubleValue();
    }

    public double getFrac() {
        return this.num.doubleValue() - this.num.intValue();
    }
}
