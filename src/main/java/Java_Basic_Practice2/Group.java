package Java_Basic_Practice2;

import java.time.LocalDate;

public class Group {
    private long counter;
    private long id;
    private String title;
    private LocalDate dateOfCreation;
    private Student[] students;
    private Specialty specialty;
    private Employee curator;


    public Group() {
        counter ++;
    }

    public Group (String title, LocalDate dateOfCreation, Student[] students,
                  Specialty specialty, Employee curator) {
        this.title = title;
        this.dateOfCreation = dateOfCreation;
        this.students = students;
        this.specialty = specialty;
        this.curator = curator;
        counter++;
    }

    public long getTotalNumber() {
        return counter;
    }

    public short getYear() {
        return (short) dateOfCreation.getYear();
    }

    public byte getSize() {
        return (byte) students.length;
    }

    public Department getDepartment() {
        return this.specialty.getDepartment();
    }

    public Faculty getFaculty() {
        return this.specialty.getFaculty();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
