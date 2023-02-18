package seminar04.lesson.Ex002;

public class Gen<T, V> {
    T objectUnknownTypeT;
    V objectUnknownTypeV;

    public Gen(T objectUnknownTypeT, V objectUnknownTypeV) {
        this.objectUnknownTypeT = objectUnknownTypeT;
        this.objectUnknownTypeV = objectUnknownTypeV;
    }

    public T getObjectUnknownTypeT() {
        return this.objectUnknownTypeT;
    }

    public V getObjectUnknownTypeV() {
        return this.objectUnknownTypeV;
    }

    public void showTypes() {
        System.out.println("Тип объекта objectUnknownTypeT: " + this.objectUnknownTypeT.getClass().getName());
        System.out.println("Тип объекта objectUnknownTypeV: " + this.objectUnknownTypeV.getClass().getName());
    }
}
