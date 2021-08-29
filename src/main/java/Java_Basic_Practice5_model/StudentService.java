package Java_Basic_Practice5_model;

import java.util.Date;

public class StudentService {

    public Student create(String firstName, String lastName, Date birthday, Date enrollmentDate) {
        Student student = null;
        try {
            student = new Student(firstName, lastName, birthday, enrollmentDate);
            student.setStatus(Status.NEW);
        } catch (PersonException e) {
            System.out.println("Make sure that birthday is valid.");
            e.printStackTrace();
        }
        return student;
    }

    public void addToGroup(Student student, Group group) {
        group.addStudent(student);
        student.setGroup(group);
        student.setStatus(Status.ACTIVE);
    }

    public void removeFromGroup(Student student, Group group) {
        group.removeStudent(student);
        student.setStatus(Status.PENDING);
    }

    public void fire(Student student) {
        student.fire();
        student.setStatus(Status.FIRED);
    }
}
