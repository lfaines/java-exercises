package exercises.ClassPrep1;

/**
 * Input/Output Exercise #1 - Unit 3.1 Class Prep
 */

public class Greetings {
    //main doesn't return anything so that's why void precedes it
    public static void main(String[] args) {
        //Remember to specify (declare) data types
        String greeting;
        String message;
        //initialize input data from user
        java.util.Scanner in;
        in = new java.util.Scanner(System.in);  //new is a keyword
        //Ask user for input
        System.out.println("What is your name?");
        //initialize data type to be accepted from user input
        greeting = in.next(); //saves the greeting
        //call declared variable
        message = "Hello, ";
        System.out.println(message + greeting + "!");
    }
}
