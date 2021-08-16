package Java_Basic_Practice3_model;

import javax.xml.bind.annotation.XmlType;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date myBirthday = new Date(2021, 01, 22);
        Date myEnrollmentDate = new Date();
        Student me = new Student("Pavlo", "Kuts", myBirthday, myEnrollmentDate);
        System.out.println(me.getId());
        Employee myCurator = new Employee("John", "Smith", myBirthday, myEnrollmentDate);
        Group myGroup = new Group("Group 17-A", myEnrollmentDate, myCurator);
        me.setGroup(myGroup);
        myGroup.addStudent(me);
        Student[] myMates = myGroup.getStudents();
        System.out.println(myMates[0].getFirstName());
        Employee headOfDep = new Employee("Gregory", "Brousee", myBirthday, myEnrollmentDate);
        Employee dean = new Employee("Charlie", "Main", myBirthday, myEnrollmentDate);
        Faculty myFaculty = new Faculty("Marine", dean);
        Department myDepart = new Department("Marine Navigation", headOfDep, myFaculty);
        Specialty radioSpec = new Specialty("Marine Ship Earth Station Operator", myDepart);
        radioSpec.addGroup(myGroup);
        System.out.println(radioSpec.getStudentsNumber());
        myFaculty.addDepartment(myDepart);
        System.out.println(myFaculty.getDepartments()[0].getTitle());
        myFaculty.removeDepartment(myDepart);
        System.out.println(myFaculty.getDepartments().length);
        myGroup.removeStudent(me);
        System.out.println(myGroup.getStudents().length);
        myGroup.addStudent(me);
        System.out.println(myGroup.getStudents()[0].getFirstName());
        System.out.println(me.getFirstName());
        me.fire();
        System.out.println(myGroup.getStudents().length);


    }
}
