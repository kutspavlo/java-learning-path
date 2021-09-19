package Java_Advanced_Practice2_model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Group extends StructuralUnit {

    private Date dateOfCreation;
    private List<Student> students = new ArrayList<>();
    private Specialty specialty;
    private Employee curator;

    public Group(String title, Date dateOfCreation, Specialty specialty, Employee curator) {
        super(title);
        this.dateOfCreation = dateOfCreation;
        this.specialty = specialty;
        this.curator = curator;
    }

    public Group(String title, Date dateOfCreation, Employee curator) {
        super(title);
        this.dateOfCreation = dateOfCreation;
        this.curator = curator;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Employee getCurator() {
        return curator;
    }

    public void setCurator(Employee curator) {
        this.curator = curator;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
       students.add(student);
    }

    public void removeStudent(Student student) {
       students.remove(student);
    }

    public short getYear(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateOfCreation);
        return (short) cal.get(Calendar.YEAR);
    }

    public byte getSize() {
        return (byte) students.size();
    }

    public Department getDepartment() {
        return specialty.getDepartment();
    }

    public Faculty getFaculty(){
        return specialty.getDepartment().getFaculty();
    }


}
