package seminar3.homework02.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void listen(String words) {
        if (words.toLowerCase().equals("���-���")) {
            System.out.println(this.getName() + ": " + "���");
        }
    }

    @Override
    public void pet() {
        System.out.println(this.getName() + ": " + "\"������\"");
    }
}
