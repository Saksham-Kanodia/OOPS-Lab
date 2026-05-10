package edu.manipal.mit.student;

public class Student {
    private String name;
    private int rollNo;
    protected String department;
    public double gpa;

    public Student(String name, int rollNo, String department, double gpa){
        this.name=name;
        this.rollNo= rollNo;
        this.department= department;
        this.gpa=gpa;
    }

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getDepartment(){
        return department;
    }
}
