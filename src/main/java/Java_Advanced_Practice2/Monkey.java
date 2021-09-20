package Java_Advanced_Practice2;

public class Monkey extends Creature {
    private String name;

    public Monkey(String name) {
        super("Monkey");
        this.name = name;
    }

    public void eat() {
        System.out.println(String.format("Monkey %s is eating now", name));
    }


}
