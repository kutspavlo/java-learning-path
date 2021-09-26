package Java_Advanced_Practice5_model;

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

        me.setEnrollmentDate(null);
        Validator validator = new Validator();
        validator.studentValidator(me);

        myCurator.setHireDate(null);
        validator.employeeValidator(myCurator);

        myGroup.setDateOfCreation(null);
        myGroup.setCurator(null);
        validator.groupValidator(myGroup);

        myDepart.setFaculty(null);
        myDepart.setHead(null);
        validator.departmentValidator(myDepart);

        myFaculty.setDateOfCreation(null);
        myFaculty.setDean(null);
        validator.facultyValidator(myFaculty);

        radioSpec.setDepartment(null);
        validator.specialtyValidator(radioSpec);
    }
}
