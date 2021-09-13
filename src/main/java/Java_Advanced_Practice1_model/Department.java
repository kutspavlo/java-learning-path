package Java_Advanced_Practice1_model;

import java.util.*;

public class Department extends StructuralUnit {
    private Set specialties = new HashSet();
    private List employees = new ArrayList();
    private Employee head;
    private Faculty faculty;

    public Department(String title, Employee head, Faculty faculty) {
        super(title);
        this.head = head;
        this.faculty = faculty;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Set getSpecialties() {
        return specialties;
    }

    public void addSpecialty(Specialty specialty){
        specialties.add(specialty);
    }

    public void removeSpecialty(Specialty specialty){
        specialties.remove(specialty);
    }

    public List getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public int getStudentsNumber() {
        int studentsNum = 0;
        for (Object s: specialties) {
            Specialty k = (Specialty) s;
            studentsNum += k.getStudentsNumber();
        }
        return studentsNum;
    }

    public byte getSize() {
        return (byte) specialties.size();
    }
}
