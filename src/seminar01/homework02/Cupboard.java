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
        System.out.println(name + " пытается открыть " + this.title);
        if (this.status == status) {
            System.out.println("Невозможно " + this.status + " " + this.title + ", он уже " + this.status);
        } else {
            this.status = status;
            System.out.println("Теперь " + this.title + " " + this.status);
        }
    }
}
