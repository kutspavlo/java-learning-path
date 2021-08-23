package Java_Basic_Practice4_model;

import java.util.Date;

public class Student extends Person implements Fireable {
    private Date enrollmentDate;
    private Group group;

    public Student(String firstName, String lastName, Date birthday, Date enrollmentDate){
        super(firstName, lastName, birthday);
        this.enrollmentDate = enrollmentDate;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Specialty getSpecialty() {
        return group.getSpecialty();
    }

    public Employee getCurator(){
        return group.getCurator();
    }

    @Override
    public Faculty getFaculty() {
        return group.getFaculty();
    }

    public void fire(){
        System.out.println(String.format("%s %s has been fired.", this.getFirstName(), this.getLastName()));
        this.group.removeStudent(Student.this);
    }
}
