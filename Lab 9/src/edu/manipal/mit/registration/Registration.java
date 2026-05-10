package edu.manipal.mit.registration;
//System.out.println("");

import edu.manipal.mit.student.*;
import edu.manipal.mit.course.*;

public class Registration {
    private Student student = new Student("Saksham", 76, "CSE Core", 8.6);
    private Course course= new Course("OOPS Lab", "Cenitta D", 3);

    public void registerStudent(){
        System.out.println("Student name: " + student.getName());
        System.out.println("Roll No.: " + student.getRollNo());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("GPA: " + student.gpa);

        System.out.println();

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Instructor: " + course.getInstructor());
        System.out.println("Credits" + course.credits);
    }

}
