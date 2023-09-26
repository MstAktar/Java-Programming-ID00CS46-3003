import javax.crypto.Cipher;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

// Question-5: Create class Sphere that inherits the class Circle from your previous answer. 
// First, add method "void getVolume()" to the class that prints out the volume of the sphere. Here, we are going to use the printf()-method of the System.out stream to control how the output looks like. But, we only want to see the first 8 decimals of the volume, so we use this format specifier "%.8f\n" with printf(). 
// Second, add default constructor and another constructor "public Sphere(double)" into the class. Both constructors need to call the corresponding constructor of the superclass. 
// Note: In your answer, put the code of both classes into the answer box one after another, first Circle and then Sphere.

class Sphere extends Circle {
    public Sphere(){
        super();
    }
    public Sphere (double radius) {
        super(radius);
    }

    public void getVolume(){
        double result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf ("%.8f\n", result);
    }
}

// Question-4: Create class Circle, that:
// has a protected member variable radius that is type double
// has public method "void getArea()" that calculates the circle area based on radius and prints it out.
// has default constructor that sets the value of radius to 1.0
// has another constructor that gets the radius as parameter
// Hint: for the value of pi, use constant Math.PI

class Circle {
    protected double radius;

    public Circle (){
        this.radius = 1.0;
    }
    public Circle (double radius){
        this.radius = radius;
    }
    public void getArea(){
        double result = Math.PI * radius * radius;
        System.out.println(result);
    }
}


class Apartment {
    private int numOfTenants;
    private int area;

    public Apartment (int numOfTenants, int area){
        this.numOfTenants = numOfTenants;
        this.area = area;
    }

    public int heatingCost (){
        int cost = numOfTenants*area;
        System.out.println( cost);
        return cost;
    }
}

// Create Java class Vehicle, that has:
// a private member variable "speed" that is integer
// a private member variable "name" that is String
// as methods, getters and setters for both member variables
// Note:You don't need to print out anything in your answer code. Below, the automatic tester does some printing when its checks your answer. 

class Vehicle {
    private int speed;
    private String name;

    public long distanceTraveled (int hours) {
        return speed*hours;
    }

    public void setSpeed ( int x ){
        this.speed = x;
    }
    public void setName ( String x) {
        this.name = x;
    }
    
    public int getSpeed (){
        return this.speed;
    }
    public String getName(){
        return this.name;
    }
}


