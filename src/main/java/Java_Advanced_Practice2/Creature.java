package Java_Advanced_Practice2;

public class Creature {
    private String title;

    public Creature(String title){
        this.title = title;
    }

    public void eat() {
        System.out.println(String.format("%s is eating now", title));
    }

    public String toString() {
        return title;
    }
}
