package Java_Basic_Practice4_model;

import java.util.Arrays;

public class Specialty extends StructuralUnit {
    private Group[] groups;
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

    public Group[] getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        if (groups == null) {
            groups = new Group[1];
            groups[0] = group;
        } else {
            groups = Arrays.copyOf(groups, groups.length + 1);
            groups[groups.length - 1] = group;
        }
    }

    public void removeGroup(Group group) {
        Group[] groupsCopy = groups.clone();
        int index = 0;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == group) {
                index = i;
                break;
            }
        }
        groups = Arrays.copyOf(groups, groups.length - 1);
        System.arraycopy(groupsCopy, 0, groups, 0, index);
        System.arraycopy(groupsCopy,index + 1, groups, index, groups.length - index);
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
