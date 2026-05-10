interface InfInterest {
    double r = 18.5;
    double calculateInterest();
}

class SimpleInterest implements InfInterest{
    double principal;
    double time;

    SimpleInterest(double principal, double time){
        this.principal = principal;
        this.time = time;
    }

    public double calculateInterest(){
        return ((principal*time*r)/100);
    }
}

class CompoundInterest implements InfInterest{
    double principal;
    double time;

    CompoundInterest(double principal, double time){
        this.principal = principal;
        this.time = time;
    }

    public double calculateInterest(){
        double CI = principal*(1+(r/100));
        for(int i=0; i<time; i++){
            CI*=CI;
        }
        return CI;
    }
}

class Main3{
    public static void main(String[] args){

    }
}