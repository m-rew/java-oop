package lecture05.Ex001;

public class Presenter {
    SumModel sumModel;
    View view;

    public Presenter(SumModel sumModel, View view) {
        this.sumModel = sumModel;
        this.view = view;
    }

    public void start() {
        this.sumModel.setX(this.view.getValue("1 значение: "));
        this.sumModel.setY(this.view.getValue("2 значение: "));
        this.view.print(this.sumModel.getResult(), "Результат: ");
    }
}
