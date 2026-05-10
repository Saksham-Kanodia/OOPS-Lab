abstract public class Figure {
    int x;
    int y;

    abstract double area(int x, int y);
}

class Rectangle extends Figure{
    double area(int x, int y){
        return x*y;
    }
}

class Triangle extends Figure{
    double area(int x, int y){
        return 0.5*x*y;
    }
}

class Square extends Figure{

    double area(int x, int y){
        return x*y;
    }
}

class Main1{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Square s = new Square();

        Figure ref;
        ref= r;
        System.out.println(ref.area(5,3));

        ref=t;
        System.out.println(ref.area(5,3));

        ref=s;
        System.out.println(ref.area(5,5));

    }
}
