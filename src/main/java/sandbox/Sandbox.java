package sandbox;

public class Sandbox {
    public static void main(String[] args) {
        Car bmw = new Car("brown", "bmw");
        System.out.println(bmw.getColor() + " " + bmw.getBrand());
        bmw.setBrand("audi");
        bmw.setColor("green");
        System.out.println(bmw.getColor() + " " + bmw.getBrand());

    }
}
