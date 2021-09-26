package Java_Advanced_Practice5;

public class Main {
    public static void main(String[] args) {
       Car bmw = new Car("bmw", 222);
       bmw.setModel(null);
       bmw.setPower(null);
       CarValidator cr = new CarValidator();
       cr.validate(bmw);
    }
}
