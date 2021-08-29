package Java_Basic_Practice5_model;

import java.util.Date;

public class EmployeeService {

    public Employee create(String firstName, String lastname, Date birthday, Date hireDate) {
        Employee employee = null;
        try {
            employee = new Employee(firstName, lastname, birthday, hireDate);
            employee.setStatus(Status.NEW);
        } catch (PersonException e) {
            System.out.println("Make sure that birthday is valid.");
        }
        return employee;
    }

    public void addToDepartment(Employee employee, Department department) {
        employee.setDepartment(department);
        department.addEmployee(employee);
        employee.setStatus(Status.ACTIVE);
    }

    public void fire(Employee employee) {
        employee.fire();
    }

}
