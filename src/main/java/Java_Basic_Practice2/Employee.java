package Java_Basic_Practice2;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private long counter;
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate hireDate;
    private Department department;


   public Employee(){
       counter++;
   }

   public Employee(String firstName, String lastName, String birthday, String hireDate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.birthday = LocalDate.parse(birthday);
       this.hireDate = LocalDate.parse(hireDate);
   }


    public long getTotalNumber() {
        return counter;
    }

    public short getAge() {
        Period age = Period.between(birthday, LocalDate.now());
        return (short) age.getYears();
    }

    public short getExperience() {
        Period exper = Period.between(hireDate, LocalDate.now());
        return (short) exper.getYears();
    }

    public Faculty getFaculty() {
        return this.department.getFaculty();
    }

    public Employee getBoss() {
        return this.department.getHead();
    }



    public long getCounter() {
        return counter;
    }

    public long getId() {
        return id;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
