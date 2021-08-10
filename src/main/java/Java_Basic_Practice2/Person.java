package Java_Basic_Practice2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class Person {

//    4. Create class Person. And then:
//    Add fields: firstName, lastName, dateOfBirth;
//    Add methods: getFullName(), getAge();
//    Create several instances of this class;
//    Put them to an array and sort it by:
//    Full name;
//    Age;
//    Add following fields: id, Person boss, Person[] colleagues;
//    Create a group of employees and join them using these fields;
//    Add more constructors to Person class;
//    Add validation functionality to them;
//    Mark id, dateOfBirth as final fields;
//    Add static counter field and static constant MIN_DATE_OF_BIRTH;
//    Refactor the validation logic in the constructors accordingly;
//    Add static method getTotalNumber();
//    Add an initialization block

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private final long id = Math.round(Math.random()*100000000);
    private Person boss;
    private List colleagues  = new ArrayList<Person>();
    static private int count;
    static private final LocalDate MIN_DATE_OF_BIRTH = LocalDate.parse("2000-01-01");

    static {
        count = 0;
    }

    {
        firstName = "Name";
        lastName = "Surname";
        dob = LocalDate.parse("1990-01-01");
    }


    public Person(String firstName, String lastName, String dob) throws Exception{
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = LocalDate.parse(dob);
        if (this.dob.isAfter(MIN_DATE_OF_BIRTH)) {
            throw new Exception("The minimum date of birth is " + MIN_DATE_OF_BIRTH.toString());
        }
        count++;
    }

    public Person() {
         count++;
    }

    public static int getTotalNumber() {
        return count;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addToColleagues(Person colleague) {
        colleagues.add(colleague);
    }

    public List<Person> getColleagues() {
        return colleagues;
    }

    public LocalDate getDob() {
        return dob;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        Period age = Period.between(dob, LocalDate.now());
        return age.getYears();
    }

    public void setBoss(Person boss) {
        this.boss = boss;
    }

    public Person getBoss() {
        return boss;
    }

}
