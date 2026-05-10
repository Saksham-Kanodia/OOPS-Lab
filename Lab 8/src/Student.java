interface Sports{
    void putSportsScore(int score);
}

class Result extends Student implements Sports{

    int SportsScore;

    public void putSportsScore(int score){
        SportsScore = score;
    }

    void finalResult(int SportsScore, int Marks){
        System.out.println("Final Marks obtained are: " + (Marks+SportsScore) );
    }
}

public class Student {
    int rollNum;
    int Marks;

    int getRollNum(){
        return rollNum;
    }

    void putRollNum(){
        System.out.println("Roll Number: " + rollNum);
    }

    int getMarks(){
        return Marks;
    }

    void putMarks(){
        System.out.println("Marks: " + Marks);
    }

}

class Main2{
    public static void main(String[] args){

        Result r = new Result();

        r.rollNum = 76;
        r.Marks = 280;

        r.putRollNum();
        r.putMarks();

        r.putSportsScore(40);
        r.finalResult(r.Marks, r.SportsScore);
    }
}