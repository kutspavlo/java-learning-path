package Java_Basic_Practice3_model;

import java.util.Arrays;

public class Department extends StructuralUnit {
    private Specialty[] specialties = new Specialty[0];
    private Employee[] employees = new Employee[0];
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

    public Specialty[] getSpecialties() {
        return specialties;
    }

    public void addSpecialty(Specialty specialty){
        specialties = Arrays.copyOf(specialties, specialties.length + 1);
        specialties[specialties.length - 1] = specialty;
    }

    public void removeSpecialty(Specialty specialty){
        Specialty[] specialtiesCopy = specialties.clone();
        int index = 0;
        for (int i = 0; i < specialties.length; i++) {
            if (specialties[i] == specialty) {
                index = i;
                break;
            }
        }
        specialties = Arrays.copyOf(specialties, specialties.length - 1);
        System.arraycopy(specialtiesCopy, 0, specialties, 0, index);
        System.arraycopy(specialtiesCopy,index + 1, specialties, index, specialties.length - index);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = employee;
    }

    public int getStudentsNumber() {
        int studentsNum = 0;
        for (Specialty s: specialties) {
            studentsNum += s.getStudentsNumber();
        }
        return studentsNum;
    }

    public byte getSize() {
        return (byte) specialties.length;
    }
}
