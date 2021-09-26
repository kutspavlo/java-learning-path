package Java_Advanced_Practice5_model;

import java.util.HashSet;
import java.util.Set;

public class Specialty extends StructuralUnit {
    private Set<Group> groups = new HashSet<>();
    @NotEmpty
    private Department department;

    public Specialty(String title, Department department) {
        super(title);
        this.department = department;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.remove(group);
    }

    public int getStudentsNumber() {
        int totalStudents = 0;
        for (Group g: groups) {
            totalStudents += g.getSize();
        }
        return totalStudents;
    }
     public Faculty getFaculty() {
        return department.getFaculty();
     }
}
