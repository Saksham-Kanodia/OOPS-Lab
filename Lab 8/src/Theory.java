//System.out.println("");
public class Theory {
    /*Objectives:- To differentiate between a concrete and an abstract class.
    To understand the fundamentals of interface.
    To demonstrate run-time polymorphism using interface references.

    Abstract Class:-

    Any class that contains one or more abstract methods is deemed to be abstract.
    An abstract method is one whose correct implementation can not be defined inside the class.
    The method as well as class can use the abstract keyword in their definition as follows:-

    abstract class class_name{
    //data members
        return_type method1(){
        //implementation
        }

        return_type method2(){
        //implementation
        }

        abstract return_type method_name(param_list);
        //other methods
    }

    Note that an abstract method does not have method body. It must be mandatorily overriden
    by every subclass of the abstract class. These subclasses upon overriding, provide concrete implementation.

    Notice that in the example given below, no objects of class A have been
    declared. As mentioned, it is  ot possible to instaantiate an abstract class. One other point:
    Class A implements concrete method called call me too(). THis is perfectly acceptable. Abstract classes
    can include as much implementation as they see fit.
     */
}

class Interfaces{
    /*
    An interface is a blueprint of a class. It has static constants
    and abstract methods only. There are mainly three reasons to use an interface.
    They are given below.

    It is used to achieve absolute abstraction.
    Interface can be used to achieve the functionality of multiple inheritances.
    It can be used to achieve coupling.

     */
}

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class C implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Show");
    }
}

class Main{
    public static void main(String[] args){
        C obj = new C();
        obj.print();
        obj.show();
    }
}
abstract class A{
    abstract void callMe();
    //concrete methods are still allowed in abstract class.
    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}

class B extends A{
    @Override
    void callMe(){
        System.out.println("B's implementation of callMe");
    }
}

class Demo{
    public static void main(String[] args){
        B b = new B();
        b.callMe();
        b.callmetoo();
    }
}
