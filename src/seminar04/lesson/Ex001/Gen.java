package seminar04.lesson.Ex001;

public class Gen <T> {
    T objectUnknownType;

    public Gen(T objectUnknownType) {
        this.objectUnknownType = objectUnknownType;
    }

    public T getObjectUnknownType() {
        return this.objectUnknownType;
    }

    public void showType(T object) {
        System.out.println("Поле имеет тип " + object.getClass().getName());
    }
}
