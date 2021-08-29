package Java_Basic_Practice5_model;

import java.util.Date;

public class Student extends Person implements Fireable {
    private Date enrollmentDate;
    private Group group;
    private FormOfEducation formOfEducation;

    public Student(String firstName, String lastName, Date birthday, Date enrollmentDate) throws PersonException {
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

    public FormOfEducation getFormOfEducation() {
        return formOfEducation;
    }

    public void setFormOfEducation(FormOfEducation formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    @Override
    public Faculty getFaculty() {
        return group.getFaculty();
    }

    public void fire(){
        System.out.println(String.format("%s %s has been fired.", this.getFirstName(), this.getLastName()));
        for (Student s : group.getStudents()) {
            if (s.getId() == this.getId()) {
                this.group.removeStudent(Student.this);
            }
        }
        this.setStatus(Status.FIRED);
    }
}
