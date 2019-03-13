package exercises.ClassPrep1;

/**
 * Numeric Types Exercise #3 - Unit 3.1 Class Prep
 */

//Formula: Divide miles driven by gas to get the miles per gallon used
public class MPG {
    public static void main(String [] args) {
        float miles;
        float gas;
        String name;

        java.util.Scanner in;
        in = new java.util.Scanner(System.in);

        System.out.println("Ready for another game? Let's play find my Miles Per Gallon! Answer two questions to find out!");
        System.out.println("First, what is your name? ");
        name = in.next();
        System.out.println(name + ", how many miles will you drive? ");
        miles = in.nextFloat();
        System.out.println("Now, " + name + ", how many gallons are in your tank? ");
        gas = in.nextFloat();
        System.out.println(name + " you did it! You found out your miles per gallon which is: " + miles / gas + " mpg!");
        System.out.println("Now drive safely! Bye!!");
    }
}