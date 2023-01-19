package seminar01.homework03;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void callCat(Cat cat, String words) {
        cat.listen(words);
    }

    public void petCat(Cat cat) {
        cat.purr();
    }
}
