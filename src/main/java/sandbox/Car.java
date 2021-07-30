package sandbox;

public class Car {
    private String brand;
    private String color;
    public Car(String theColor, String theBrand) {
        this.color = theColor;
        this.brand = theBrand;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

