package Java_Basic_Practice5_model;

import java.util.Date;

public class StudentService {

    public Student create(String firstName, String lastName, Date birthday, Date enrollmentDate) throws PersonException {
        Student student = new Student(firstName, lastName, birthday, enrollmentDate);
        student.setStatus(Status.NEW);
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
