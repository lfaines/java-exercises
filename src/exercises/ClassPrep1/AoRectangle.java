package exercises.ClassPrep1;

/**
 * Numeric Types Exercise # 2 - Unit 3.1 Class Prep
 */
//Formula: Multiply length times width to find the area of a rectangle
public class AoRectangle {
    public static void main(String[] args) {
        float length; //can write it as "int length, width;
        float width;
        java.util.Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Welcome to: Let's find the Area of the Rectangle! Answer two questions to find out!");
        System.out.println("What is the length of the rectangle?");
        System.out.println("What is the width of the rectangle?");
        length = in.nextFloat();
        width = in.nextFloat();
        System.out.println("Drumroll please... The Area of the Rectangle is: " + length * width + " sq ft");
        System.out.println("Thank you for playing Area of the Rectangle! Have a GREAT day!!");
    }
}
