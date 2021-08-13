package Java_Basic_Practice3_model;

import java.util.Arrays;
import java.util.Date;

public class Faculty extends StructuralUnit{
    private Date dateOfCreation;
    private Department[] departments;
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

    public Department[] getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments = Arrays.copyOf(departments, departments.length + 1);
        departments[departments.length - 1] = department;
    }

    public void removeDepartment(Department department) {
        Department[] departmentsCopy = departments.clone();
        int index = 0;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == department) {
                index = i;
                break;
            }
        }
        departments = Arrays.copyOf(departments, departments.length - 1);
        System.arraycopy(departmentsCopy, 0, departments, 0, index);
        System.arraycopy(departmentsCopy,index + 1, departments, index, departments.length - index);
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
            totalEmpl += d.getEmployees().length;

        }
        return totalEmpl;
    }
}
