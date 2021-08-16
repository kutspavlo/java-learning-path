package Java_Basic_Practice4;

public enum Color {
    RED ("red"),
    GREEN ("green"),
    BLUE ("blue"),
    WHITE ("white"),
    BLACK ("black"),
    ORANGE ("orange");

    private String title;

    Color(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
