package Java_Advanced_Practice2_model;

public abstract class Persistable {
    private static long counter;
    private final long id = (long) System.identityHashCode(this);

    public Persistable(){
        counter++;
    }

    public long getId() {
        return id;
    }

    public static long getTotalNumber(){
        return counter;
    }
}
