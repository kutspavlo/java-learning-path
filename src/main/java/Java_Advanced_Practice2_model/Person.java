package Java_Advanced_Practice2_model;

import java.util.Calendar;
import java.util.Date;

public abstract class Person extends Persistable {
    private String firstName;
    private String lastName;
    private Date birthday;


    public Person(String firstName, String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public short getAge() {
        Calendar today = Calendar.getInstance();
        Calendar birthdayCal = Calendar.getInstance();
        birthdayCal.setTime(birthday);
        int age = today.get(Calendar.YEAR) - birthdayCal.get(Calendar.YEAR);
        if (birthdayCal.get(Calendar.MONTH) > today.get(Calendar.MONTH)) {
            age--;
        }
        if (birthdayCal.get(Calendar.MONTH) == today.get(Calendar.MONTH)
                && birthdayCal.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH)) {
            age--;
        }
        return (short) age;
    }

    public abstract Faculty getFaculty();
}
