package Java_Basic_Practice5_model;

public class DepartmentService {
    public Department create(String title, Employee head, Faculty faculty) {
        Department department = null;
        try {
            department = new Department(title, head, faculty);
        } catch (UnitException e) {
            System.out.println("Title cannot be empty");
            e.printStackTrace();
        }
        return department;
    }

    public void setFaculty(Department department, Faculty faculty) {
        department.setFaculty(faculty);
        faculty.addDepartment(department);
    }


}
