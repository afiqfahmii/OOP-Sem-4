import java.util.Scanner;

public class App { //!Outter Class

    
public static class Person { //!Inner Class
    String name;
    static int counter;

    Person() {
        counter++;
    }

    Person(String nm) {
        this.name = nm;
        counter++;
    }

    public void sum() { //! Method Overloading : Define multiple method with same name

    }

    public void sum(int a, int b) {
        
    }

    public void sum(double a, double b) {
        
    }

    static int displayCounter() {
        return counter;
    }

    public static void setCounter(int val) {
        counter = val;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + "'}";
    }

}


    

    public static void main(String[] args)  {

        /* Example Static 
        System.out.println("Pi is :"+Math.PI);
        double result = Math.pow(3,3);
        */

        System.out.println();//Static method from class method

        System.out.println("Line 36 : "+Person.displayCounter());

        Person p1 = new Person("Siti");
        int count = Person.displayCounter();

        System.out.println("Counter: " + count);
        System.out.println(p1.toString());

        // p1.finalize(){};

    }
}