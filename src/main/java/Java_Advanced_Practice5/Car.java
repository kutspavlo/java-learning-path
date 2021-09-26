package Java_Advanced_Practice5;

import java.util.Date;

public class Car {

    @NotEmpty
    private String model;
    @NotEmpty
    private Integer power;
    @NotEmpty
    private Date dateOfCreation;


    public Car(String model, Integer power, Date dateOfCreation) {
        this.model = model;
        this.power = power;
        this.dateOfCreation = dateOfCreation;
    }

    public Car(String model, Integer power) {
        this.model = model;
        this.power = power;
    }

    @NotEmpty
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @NotEmpty
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @NotEmpty
    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
