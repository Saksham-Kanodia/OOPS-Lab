//System.out.println("");

import java.util.Scanner;

public class Student {
    String sname;
    String Id;
    int n;
    int[] marks_array;

    Student(String sname, String Id, int n){
        this.sname = sname;
        this.Id = Id;
        this.n = n;
        this.marks_array = new int[n];
    }

    void assignMarks(Scanner scanner){
        System.out.println("Enter marks: ");

        for(int i=0; i<n; i++){
            marks_array[i] = scanner.nextInt();
        }
        scanner.nextLine();
    }

    void compute(){
        int total=0; double avg;
        for(int i=0; i<n; i++){
            total += marks_array[i];
        }
        avg = (double)total/n;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: "+avg);

    }

    void display(){
        System.out.println("Name: " + sname);
        System.out.println("Id: " +Id);
    }
}

class ScienceStudent extends Student{
    int practicalMarks;

    ScienceStudent(String sname, String Id, int n, int practicalMarks){
        super(sname, Id, n);
        this.practicalMarks = practicalMarks;
    }

    @Override
    void compute(){
        int total=0; double avg;
        for(int i=0; i<n; i++){
            total += marks_array[i];
        }
        total+=practicalMarks;
        avg = (double)total/n;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: "+avg);
    }

    void displayPracticalMarks(){
        super.display();
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

class ArtsStudent extends Student{
    String electiveSubject;

    ArtsStudent(String sname, String Id, int n,String electiveSubject){
        super(sname, Id, n);
        this.electiveSubject = electiveSubject;
    }

    void displayElectiveSubject(){
        super.display();
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student("Saksham", "101", 3);
        s1.assignMarks(scanner);
        s1.display();
        s1.compute();

        ScienceStudent s2 = new ScienceStudent("Saksham", "101", 3, 100);
        s2.assignMarks(scanner);
        s2.displayPracticalMarks();
        s2.compute();

        ArtsStudent s3 = new ArtsStudent("Saksham", "101", 3, "Arts");
        s3.assignMarks(scanner);
        s3.displayElectiveSubject();

        scanner.close();
    }
}