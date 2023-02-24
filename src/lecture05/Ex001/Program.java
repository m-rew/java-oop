package lecture05.Ex001;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new SumModel(), new View());
        presenter.start();
    }
}
