package Java_Basic_Practice2;

import java.time.LocalDate;

public class Faculty {
    private long counter;
    private long id;
    private String title;
    private LocalDate dateOfCreation;
    private Department[] departments;
    private Employee dean;
    
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
    

}

