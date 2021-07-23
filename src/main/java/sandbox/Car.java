package sandbox;

public class Car {
    private String brand;
    private String color;
    public Car(String theColor, String theBrand) {
        this.color = theColor;
        this.brand = theBrand;
    }
    public String getCarBrand() {
        return this.brand;
    }
    public String getCarColor() {
        return this.color;
    }
}

