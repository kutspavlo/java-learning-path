package Java_Advanced_Practice1_model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Faculty extends StructuralUnit {
    private Date dateOfCreation;
    private List<Department> departments = new ArrayList<>();
    private Employee dean;

    public Faculty(String title, Date dateOfCreation, Employee dean) {
        super(title);
        this.dateOfCreation = dateOfCreation;
        this.dean = dean;
    }

    public Faculty(String title, Employee dean) {
        super(title);
        this.dean = dean;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
    
    public int getStudentsNumber() {
        int totalStudents = 0;
        for (Department d: departments) {
            totalStudents += d.getStudentsNumber();
        }
        return totalStudents;
    }

    public int getEmployeesNumber() {
        int totalEmpl = 0;
        for (Department d: departments) {
            totalEmpl += d.getEmployees().size();

        }
        return totalEmpl;
    }
}
