package Java_Advanced_Practice5_model;

public abstract class StructuralUnit extends Persistable {
    private String title;

    public StructuralUnit(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
