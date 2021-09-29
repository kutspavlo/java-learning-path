package Java_Advanced_Practice6;

public class Main {
    public static void main(String[] args) {
        //1. Create several instances of Runnable interface with different implementation
        Runnable ref = ()-> System.out.println("Runnable interface with lambda expression");
        Runnable ref2 = ()-> {
            System.out.println("New thread has been started");
            Thread newThread = new Thread(ref);
            newThread.start();
            System.out.println("One more thread has been started. NAME: " + newThread.getName());
        };

        new Thread(ref).start();
        new Thread(ref2).start();

    }
}
