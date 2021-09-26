package Java_Advanced_Practice5_model;


import java.lang.reflect.Field;

public class Validator {

    public void studentValidator(Student student) {
        Field[] fields = student.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.equals(student.getClass().getDeclaredField("enrollmentDate")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (student.getEnrollmentDate() == null) {
                        System.out.println("Validation error: Student has empty enrollment date");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

    public void employeeValidator(Employee employee) {
        Field[] fields = employee.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.equals(employee.getClass().getDeclaredField("hireDate")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (employee.getHireDate() == null) {
                        System.out.println("Validation error: Employee has empty hire date");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }

    }

    public void groupValidator(Group group) {
        Field[] fields = group.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.equals(group.getClass().getDeclaredField("dateOfCreation")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (group.getDateOfCreation() == null) {
                        System.out.println("Validation error: Group has empty date of creation");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            try {
                if (f.equals(group.getClass().getDeclaredField("curator")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (group.getCurator() == null) {
                        System.out.println("Validation error: Group has no curator");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }

    }

    public void departmentValidator(Department department) {
        Field[] fields = department.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.equals(department.getClass().getDeclaredField("head")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (department.getHead() == null) {
                        System.out.println("Validation error: Department has no head assigned");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            try {
                if (f.equals(department.getClass().getDeclaredField("faculty")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (department.getFaculty() == null) {
                        System.out.println("Validation error: Department has no faculty assigned");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }

    }

    public void facultyValidator(Faculty faculty) {
        Field[] fields = faculty.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.equals(faculty.getClass().getDeclaredField("dateOfCreation")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (faculty.getDateOfCreation() == null) {
                        System.out.println("Validation error: Faculty has no creation date");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            try {
                if (f.equals(faculty.getClass().getDeclaredField("dean")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (faculty.getDean() == null) {
                        System.out.println("Validation error: Faculty has no dean assigned");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

    public void specialtyValidator(Specialty specialty) {
        Field[] fields = specialty.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.equals(specialty.getClass().getDeclaredField("department")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (specialty.getDepartment() == null) {
                        System.out.println("Validation error: Specialty has no department assigned");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

}
