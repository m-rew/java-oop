package seminar04.lesson.Ex004;

public class Class<T> implements Contain<T> {
    T[] array;

    Class(T[] array) {
        this.array = array;
    }

    @Override
    public boolean contains(T objectUnknownType) {
        for (T el: this.array) {
            if (el.equals(objectUnknownType)) {
                return true;
            }
        }

        return false;
    }
}
