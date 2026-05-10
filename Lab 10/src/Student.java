import java.util.Scanner;

public class Student {

    private String name;
    private int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    void registerStudent(String name,int age){
        if(age>=18 && age<=60){
            System.out.println("Student registered successfully.");
        }

        else
            throw new IllegalArgumentException();
    }
}

class StudentValidationAgeDemo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Student s = new Student(name, age);

        try{
            s.registerStudent(name,age);
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception caught successfully.");
        }

        System.out.println("After try catch block.");

        scanner.close();

    }
}
