package lecture05.Ex002;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new NoteBook(), new View());
        presenter.start();
    }
}
