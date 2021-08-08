package Java_Basic_Practice2;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private static long counter;
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate enrollmentDate;
    private Group group;



    public Student() {
        counter++;
    }

    public Student(String firstName, String lastName, String birthday, Group group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.parse(birthday);
        this.group = group;
        counter++;
    }


    public static long getTotalNumber() {
        return counter;
    }

    public short getAge() {
        Period age = Period.between(birthday, LocalDate.now());
        return (short) age.getYears();
    }

    public Specialty getSpecialty() {
        return this.group.getSpecialty();
    }

    public Faculty getFaculty() {
        return this.group.getSpecialty().getFaculty();
    }

    public Employee getCurator() {
        return this.group.getCurator();
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

    public Group getGroup() {
        return group;
    }

    public long getId() {
        return id;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
