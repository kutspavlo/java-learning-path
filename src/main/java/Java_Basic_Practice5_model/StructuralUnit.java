package Java_Basic_Practice5_model;

public abstract class StructuralUnit extends Persistable {
    private String title;

    public StructuralUnit(String title) throws UnitException {
        if (title == "") {
            throw new UnitException();
        }
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
