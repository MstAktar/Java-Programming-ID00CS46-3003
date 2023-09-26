public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        multiply(3,4);
        checkNum(56);
        greet (2);
        oddOut((short) 9);
        factorial(3);
    }

/* QUESTION-1: Modify the code below followingly:
Multiply the variables a and b
Multiply the product by two
Add one to the new product
Print the final product to the console*/

    static public void multiply(int a, int b){

    //Add your code here

    int result1 =  a * b;
    int result2 = result1 * 2;
    int result3 = result2 + 1;

    System.out.println(result3);
}

/* QUESTION-2: Modify the code below to:
Print out to console string "pos" if the function parameter num is positive
Print out to console string "neg" if num is negative
Print out to console string "zero" if num equals zero*/

static public void checkNum(int num){
    
    // Write your code here

    if (num > 0){
        System.out.println("pos");
    } 
    else if (num < 0){
        System.out.println("neg");
    }
    else {
        System.out.println("zero");
    }
}

/* QUESTION-3: Modify the method below to greet all visitors by printing out to the console 
the string "Hello n!" for each of them, where n is the number of visitor, starting from 1.*/

static public void greet(int numOfVisitors){
        
    // Write your code here
 
    for (int i = 1; i <= numOfVisitors; i++){
        System.out.println("Hello " + i + "!" );
    }
}

/*QUESTION-4: Modify the method below to print out all even numbers above zero until the function parameter limit. 
The numbers are separated by comma and printed without new line. Handling the comma in printing out 
the numbers could be a little tricky..*/

static public void oddOut(short limit) {
        
    // Write your code here

    for(int i = 2; i <= limit; i+=2){
        if (i==2){
            System.out.print(i);
            continue;
        }
        System.out.print("," + i);
    }

}

/*QUESTION-5: Create a function that calculates the factorial of the given function parameter num, 
where the value of num must be between 1 and 20. Print out the result to the console. 
If the value of num is less than 1 or larger than 20, the function prints out string "not allowed".*/

static public void factorial(int num){

    if (num < 1 || num > 20){
        System.out.println("not allowed");
        return;
    }
    int result = 1;
    for(int i = 1; i<= num; i++){
        result = result*i;
    }
    System.out.println(result);
}


}
