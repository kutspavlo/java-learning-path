package Java_Basic_Practice3_model;

import java.util.Calendar;
import java.util.Date;

public class Employee extends Person implements Fireable{
    private Date hireDate;
    private Department department;

    public Employee(String firstName, String lastName, Date birthday, Date hireDate){
        super(firstName, lastName, birthday);
        this.hireDate = hireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public short getExperience(){
        Calendar today = Calendar.getInstance();
        Calendar hired = Calendar.getInstance();
        hired.setTime(hireDate);
        int experience = today.get(Calendar.YEAR) - hired.get(Calendar.YEAR);

        return (short) experience;
    }

    public Employee getBoss(){
        return department.getHead();
    }

    @Override
    public Faculty getFaculty() {
        return department.getFaculty();
    }

    public void fire(){
        System.out.println(this.getFirstName() + " " + this.getLastName() + " get fired today :(");
    }
}
