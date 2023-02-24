package lecture05.Ex002;

public class Presenter {
    public NoteBook noteBook;
    public View view;

    public Presenter(NoteBook noteBook, View view) {
        this.noteBook = noteBook;
        this.view = view;
    }

    public void start() {
        while (true) {
            view.showMenu();

            switch (view.eventListener()) {
                case 1: view.print("������ ���������", "\n" + noteBook.getContactAll());
                    break;
                case 2: view.print("�������� ��������");
                    this.noteBook.addContact(view.read("���"), view.read("�������"));
                    view.print("������� ������!");
                    break;
                case 5: return;
            }
        }
    }
}
