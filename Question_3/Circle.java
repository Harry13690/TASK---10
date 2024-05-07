package task10.Question_3;

public class Circle {

    double radius;
    double c;
    double pi = 3.14;

    //Default Constructor
    public Circle(){
    }

    //Constructor with Two Arugments
    public Circle(String name, int size){
    }

    //Function to Calculate the Circumference of the Circle
    public void circumference(double radius){
        c = 2 * pi * radius;
        System.out.println(c);
    }
}
