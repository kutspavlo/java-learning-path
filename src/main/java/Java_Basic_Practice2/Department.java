package Java_Basic_Practice2;

public class Department {
    private long counter;
    private long id;
    private String title;
    private Specialty[] specialties;
    private Employee[] members;
    private Employee head;
    private Faculty faculty;

    public Department() {
        counter++;
    }

    public Department(String title, Specialty[] specialties, Employee[] members, Employee head, Faculty faculty){
        this.title = title;
        this.specialties = specialties;
        this.members = members;
        this.head = head;
        this.faculty = faculty;
    }
    
    public long getTotalNumber() {
        return counter;
    }
    
    public int getStudentsNumber() {
        int total = 0;
        for (int i = 0; i < specialties.length; i++) {
            total += specialties[i].getStudentsNumber();
        }
        return total;
    }


    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee[] getMembers() {
        return members;
    }

    public void setMembers(Employee[] members) {
        this.members = members;
    }

    public Specialty[] getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Specialty[] specialties) {
        this.specialties = specialties;
    }
}
