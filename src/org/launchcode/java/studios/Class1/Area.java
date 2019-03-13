package org.launchcode.java.studios.Class1;

/** TODO: Write a program/class Area that prompts the user for a number,
 * and then calculate the area of a circle with that radius and print the result.
 * Note: Recall that the area of a circle is A = pi * r * r where pi is 3.14 and r is the radius.
 * Math.PI is a built-in function
 * static method means outside of the main method
 */

public class Area {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in); //the keyword new is an initializer
        System.out.println("Enter a number to calculate the area of a circle. ");
        double number = in.nextDouble();
        double pi = 3.14;
        number = pi * number * number;
        System.out.println("Based on the number you entered, the area of the circle is " + number);
    }
}