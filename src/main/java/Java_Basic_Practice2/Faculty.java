package Java_Basic_Practice2;

import java.time.LocalDate;

public class Faculty {
    private long counter;
    private long id;
    private String title;
    private LocalDate dateOfCreation;
    private Department[] departments;
    private Employee dean;

    public Faculty() {
        counter++;
    }

    public Faculty(String title, String dateOfCreation, Employee dean) {
        this.title = title;
        this.dateOfCreation = LocalDate.parse(dateOfCreation);
        this.dean = dean;
        counter++;
    }


    public long getTotalNumbers() {
        return counter;
    }
    
    public int getStudentsNumber() {
        int total = 0;
        for (int i = 0; i < departments.length; i++) {
            total += departments[i].getStudentsNumber();
        }
        return total;
    }
    
    public int getEmployeesNumber() {
        int total = 0;
        for (int i = 0; i < departments.length; i++) {
            total += departments[i].getMembers().length;
        }
        return total;
    }
    
    public Specialty[] getSpecialties(){
        int total = 0;
        for (int i = 0; i < departments.length; i++) {
            total += departments[i].getSpecialties().length;
        }
        Specialty[] specialties = new Specialty[total];
        int count = 0;
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments[i].getSpecialties().length; j++) {
                specialties[count] = departments[i].getSpecialties()[j];
                count++;
            }
        }
        return specialties;
    }

    public Group[] getGroups(){
        int total = 0;
        for (int i = 0; i < departments.length; i++) {
            total += departments[i].getGroups().length;
        }

        Group[] groups = new Group[total];
        int count = 0;
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments[i].getGroups().length; j++) {
                groups[count] = departments[i].getGroups()[j];
            }
        }
        return groups;
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

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

}

