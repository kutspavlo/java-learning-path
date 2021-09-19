package Java_Advanced_Practice2_model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Department extends StructuralUnit {
    private Set<Specialty> specialties = new HashSet<>();
    private List<Employee> employees = new ArrayList<>();
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

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void addSpecialty(Specialty specialty){
        specialties.add(specialty);
    }

    public void removeSpecialty(Specialty specialty){
        specialties.remove(specialty);
    }

    public List<Employee> getEmployees() {
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
        for (Specialty s: specialties) {
            studentsNum += s.getStudentsNumber();
        }
        return studentsNum;
    }

    public byte getSize() {
        return (byte) specialties.size();
    }
}
