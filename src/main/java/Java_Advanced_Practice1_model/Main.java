package Java_Advanced_Practice1_model;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date myBirthday = new Date(91, 00, 22); //1991-Jan-22
        Date myEnrollmentDate = new Date();
        Student me = new Student("Pavlo", "Kuts", myBirthday, myEnrollmentDate);
        Employee myCurator = new Employee("John", "Smith", myBirthday, myEnrollmentDate);
        Group myGroup = new Group("Group 17-A", myEnrollmentDate, myCurator);
        Employee headOfDep = new Employee("Gregory", "Brousee", myBirthday, myEnrollmentDate);
        Employee dean = new Employee("Charlie", "Main", myBirthday, myEnrollmentDate);
        Faculty myFaculty = new Faculty("Marine", dean);
        Department myDepart = new Department("Marine Navigation", headOfDep, myFaculty);
        Specialty radioSpec = new Specialty("Marine Ship Earth Station Operator", myDepart);



        me.setEnrollmentDate(myEnrollmentDate);
        System.out.println(me.getEnrollmentDate());

        myCurator.setHireDate(myEnrollmentDate);
        System.out.println(myCurator.getHireDate());

        System.out.println(myCurator.getExperience());

        myGroup.setCurator(myCurator);
        myGroup.setDateOfCreation(myEnrollmentDate);
        System.out.println(myGroup.getDateOfCreation());

        myGroup.addStudent(me);
        System.out.println(myGroup.getStudents().get(0));

        myGroup.removeStudent(me);
        System.out.println(myGroup.getStudents().size());

        myDepart.setHead(myCurator);
        myDepart.addSpecialty(radioSpec);
        System.out.println(myDepart.getSpecialties().contains(radioSpec));
        myDepart.removeSpecialty(radioSpec);
        System.out.println(myDepart.getSpecialties().size());

        myDepart.addEmployee(myCurator);
        System.out.println(myDepart.getEmployees().contains(myCurator));
        myDepart.removeEmployee(myCurator);
        System.out.println(myDepart.getEmployees().size());

        myFaculty.setDean(myCurator);
        System.out.println(myFaculty.getDean().getFirstName());
        System.out.println(myFaculty.getEmployeesNumber());
        myFaculty.addDepartment(myDepart);
        System.out.println(myFaculty.getDepartments().contains(myDepart));
        myFaculty.removeDepartment(myDepart);
        System.out.println(myFaculty.getDepartments().size());

        radioSpec.setDepartment(myDepart);
        radioSpec.addGroup(myGroup);
        System.out.println(radioSpec.getGroups().contains(myGroup));
        radioSpec.removeGroup(myGroup);
        System.out.println(radioSpec.getGroups().size());
    }
}
