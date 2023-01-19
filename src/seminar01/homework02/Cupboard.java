package seminar01.homework02;

enum Status {
    open,
    closed
}

public class Cupboard {
    private String title;
    private Status status;

    public Cupboard(String title) {
        this.title = title;
        this.status = Status.closed;
    }

    public void setStatus(String name, Status status) {
        System.out.println(name + " �������� ������� " + this.title);
        if (this.status == status) {
            System.out.println("���������� " + this.status + " " + this.title + ", �� ��� " + this.status);
        } else {
            this.status = status;
            System.out.println("������ " + this.title + " " + this.status);
        }
    }
}
