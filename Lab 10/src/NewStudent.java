public class NewStudent {
    String name;
    int totalMarks;
    int numOfSubjects;

    NewStudent(String name, int totalMarks, int numOfSubjects){
        this.name = name;
        this.totalMarks = totalMarks;
        this.numOfSubjects = numOfSubjects;
    }

    double calculateAverage(int totalMarks, int numOfSubjects){
        if(numOfSubjects==0){
            throw new ArithmeticException("Division by zero not possible.");
        }
        else{
            double avg= (double)(totalMarks)/numOfSubjects;
            return avg;
        }
    }
}

class MarksValidationDemo{
    public static void main(String[] args){

        NewStudent s1 = new NewStudent("Saksham", 280, 6);
        NewStudent s2 = new NewStudent("Broto", 280, 0);

        try{
            double avg1 = s1.calculateAverage(s1.totalMarks, s1.numOfSubjects);
            System.out.println("Average marks: " + avg1);
            double avg2 = s2.calculateAverage(s2.totalMarks, s2.numOfSubjects);
            System.out.println("Average marks: " + avg2);
        }catch(ArithmeticException e){
            System.out.println("Number Of subjects Can't be zero");
        }

    }
}
