package Java_Basic_Practice2;

public class Specialty {
    private long counter;
    private long id;
    private String title;
    private Department department;
    private Group[] groups;


    public Specialty(){
        counter++;
    }

    public Specialty(String title, Department department, Group[] groups){
        this.title = title;
        this.department = department;
        this.groups = groups;

    }

    public long getTotalNumber() {
        return counter;
    }

    public int getStudentsNumber() {
        int total = 0;
        for (int i = 0; i < groups.length; i++) {
            total += groups[i].getSize();
        }
        return  total;
    }

    public Faculty getFaculty() {
        return this.department.getFaculty();
    }

    public Employee[] getCurators() {
        Employee[] curators = new Employee[groups.length];
        for (int i = 0; i < groups.length; i++) {
            curators[i] = groups[i].getCurator();
        }
        return curators;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
