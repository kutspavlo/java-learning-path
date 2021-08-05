package Java_Basic_Practice2;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    private final String firstName;
    private final String lastName;
    private LocalDate dob;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){
        this.firstName = null;
        this.lastName = null;
    }

    public String getFullName() {
        return new String(firstName + " " + lastName);
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getAge() {
        Period age = Period.between(dob, LocalDate.now());
        return age.getYears();
    }

}
