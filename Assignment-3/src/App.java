import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

    // Question-1: Create class ListMultiplier that multiplies the elements in a list.

    // The class has the following members:
    // - private LinkedList of Integers
    // - public method void add(Integer) that takes an integer as parameter and adds it to the list
    // - public method multiply() that returns the result of multiplication (return type Integer)
    
    // In your answer, return the class.
    
    // Hint. Don't forget to import the utility class LinkedList

class ListMultiplier {
    private LinkedList<Integer> list = new LinkedList<Integer>();

    public void add(Integer number) {
        list.add(number);
    }

    public Integer multiply() {
        Integer result = 1;
        // for (Integer number : list) {
        //     result *= number;
        // }
        for (int i = 0; i < list.size(); i++) {
            result *= list.get(i);
        }
        return result;
    }
}
    
// Questiomn-2: Create class ListFinder that finds the common elements in two lists of Integers and calculates their sum. 
// The class has the following method: public Integer getListSum(ArrayList<Integer> list1, ArrayList<Integer> list2)

// So, the method takes two ArrayLists of Integers as input. As an example, the lists are 1,2,3,4,5 and 2,3 where the common elements are 2,3 and their sum is 2+3 = 5.

// In your answer, return the class.

// Hint. Don't forget to import the utility class ArrayList
// Hint. Now its a good time to take a look into the Java documentation regarding lists, you might find some useful methods there to use with this exercise. 

class ListFinder {
    public Integer getListSum(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Integer sum = 0;
        // for (Integer number : list1) {
        //     if (list2.contains(number)) {
        //         sum += number;
        //     }
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                sum += list1.get(i);
            }
        }
        return sum;
    }
}

// Create interface Polygon that describes the following methods:
// - int getHeight()
// - int getWidth()
// - int getArea()

// Then create a class Triangle that implements the interface. Obviously, the method getArea() returns the area of the defined triangle (where width is the base).

// In your answer, return both the interface and the class.

interface Polygon {
    int getHeight();
    int getWidth();
    int getArea();
}

class Triangle implements Polygon {
    private int height;
    private int width;

    public Triangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getArea() {
        return (this.height * this.width) / 2;
    }
}

// Create class Polygons that has the following:
// - Attribute Stack<Triangle> named triangles, visibility private. Re-use the Triangle class and Polygon interface from your answer in previous Question 1.
// - Method "public void add(Triangle t)" that adds a triangle into the stack. 
// - Method "public int getTotalArea()" that calculates the total area of all triangles in the stack.

// Hint: Before you add an object to a list, you need to instantiate it!
// Hint: Use the for each loop to calculate the total area as demonstrated in the lecture material

// In your answer, return all the Polygon interface, Triangle class and Polygons class. Dont forget to add the import statement for java.util.Stack into your code. 

class Polygons {
    private Stack<Triangle> triangles = new Stack<Triangle>();

    public void add(Triangle t) {
        triangles.push(t);
    }

    public int getTotalArea() {
        int totalArea = 0;
        // for (Triangle t : triangles) {
        //     totalArea += t.getArea();
        // }
        for (int i = 0; i < triangles.size(); i++) {
            totalArea += triangles.get(i).getArea();
        }
        return totalArea;
    }
}