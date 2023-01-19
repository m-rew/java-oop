package seminar01.homework02;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void openCupboard(Cupboard cupboard) {
        cupboard.setStatus(this.name, Status.open);
    }

    public void closeCupboard(Cupboard cupboard) {
        cupboard.setStatus(this.name, Status.closed);
    }
}
