import java.util.Scanner;
//System.out.println("");
class CourseFullException extends Exception{
    CourseFullException(String message){
        super(message);
    }
}

class Course{
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    Course(String courseName, int capacity, int enrolledStudents){
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = enrolledStudents;
    }

    void enrollStudent() throws CourseFullException{
        if(capacity<=enrolledStudents){
            throw new CourseFullException("Course is Full");
        }
        else{
            enrolledStudents++;
            System.out.println("Student successfully enrolled. Enrolled Students: " + enrolledStudents);
        }
    }
}

class CourseCapacityDemo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course name: ");
        String name = scanner.nextLine();

        System.out.println("Enter capacity: ");
        int cap = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter enrolled students: ");
        int enrolledCnt = scanner.nextInt();
        scanner.nextLine();

        Course c = new Course(name, cap, enrolledCnt);

        try{
            c.enrollStudent();
        }catch(CourseFullException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Registration process completed.");
        }

        scanner.close();
    }
}
