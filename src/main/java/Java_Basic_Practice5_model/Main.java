package Java_Basic_Practice5_model;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws PersonException, UnitException {
        Date myBirthday = new Date(91, 00, 22); //1991-Jan-22
        Date myEnrollmentDate = new Date();
        Employee myCurator = new Employee("John", "Smith", myBirthday, myEnrollmentDate);
        Group myGroup = new Group("Group 17-A", myEnrollmentDate, myCurator);
        Employee headOfDep = new Employee("Gregory", "Brousee", myBirthday, myEnrollmentDate);
        Employee dean = new Employee("Charlie", "Main", myBirthday, myEnrollmentDate);
        Faculty myFaculty = new Faculty("Marine", dean);
        Department myDepart = new Department("Marine Navigation", headOfDep, myFaculty);
        Specialty radioSpec = new Specialty("Marine Ship Earth Station Operator", myDepart);

        StudentService studentService = new StudentService();
        Student me = studentService.create("Pavlo", "Kuts", myBirthday, myEnrollmentDate);
        System.out.println(me.getStatus());
        studentService.addToGroup(me, myGroup);
        System.out.println(me.getGroup().getTitle());
        System.out.println(myGroup.getStudents()[0].getFirstName());
        System.out.println(me.getStatus());
        studentService.removeFromGroup(me, myGroup);
        System.out.println(myGroup.getStudents().length);
        System.out.println(me.getStatus());
        System.out.println(myGroup.getStudents().length);
        me.fire();
        System.out.println(me.getStatus());

        DepartmentService ds = new DepartmentService();
        Department myNewDep =  ds.create("New Depart", myCurator, myFaculty);
        System.out.println(myNewDep.getTitle());
        ds.setFaculty(myNewDep, myFaculty);
        System.out.println(myNewDep.getFaculty().getTitle());


        EmployeeService emp = new EmployeeService();
        Employee newCurator =  emp.create("Jean", "Bin", myBirthday, myEnrollmentDate);
        emp.addToDepartment(newCurator, myDepart);
        System.out.println(myDepart.getEmployees()[0].getFirstName());
        emp.fire(newCurator);
        System.out.println(newCurator.getStatus());

    }
}
