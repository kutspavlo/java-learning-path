package Java_Basic_Practice3_model;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Group extends StructuralUnit {

    private Date dateOfCreation;
    private Student[] students = new Student[0];
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

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (students == null) {
            students = new Student[1];
            students[0] = student;
        } else {
            students = Arrays.copyOf(students, students.length + 1);
            students[students.length - 1] = student;
        }
    }

    public void removeStudent(Student student) {
        Student[] studentsCopy = students.clone();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                index = i;
                break;
            }
        }
        students = Arrays.copyOf(students, students.length - 1);
        System.arraycopy(studentsCopy, 0, students, 0, index);
        System.arraycopy(studentsCopy,index + 1, students, index, students.length - index);
    }

    public short getYear(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateOfCreation);
        return (short) cal.get(Calendar.YEAR);
    }

    public byte getSize() {
        return (byte) students.length;
    }

    public Department getDepartment() {
        return specialty.getDepartment();
    }

    public Faculty getFaculty(){
        return specialty.getDepartment().getFaculty();
    }


}
