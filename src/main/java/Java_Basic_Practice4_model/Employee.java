package Java_Basic_Practice4_model;

import java.util.Calendar;
import java.util.Date;

public class Employee extends Person implements Fireable {
    private Date hireDate;
    private Department department;
    private FormOfWork formOfWork;

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

    public FormOfWork getFormOfWork() {
        return formOfWork;
    }

    public void setFormOfWork(FormOfWork formOfWork) {
        this.formOfWork = formOfWork;
    }

    public Employee getBoss(){
        return department.getHead();
    }

    @Override
    public Faculty getFaculty() {
        return department.getFaculty();
    }

    public void fire(){
        System.out.println(String.format("%s %s has been fired.", this.getFirstName(), this.getLastName()));
        this.setStatus(Status.FIRED);
    }
}
