package exercises.ClassPrep2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** HashMap Exercise #4 - Unit 3.2 Class Prep
 * TODO: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers)
instead of names and grades. In this case, however, the keys should be integers (the IDs) and the values should
 be strings (the names). Modify the roster printing code accordingly.
 */

public class Gradebook {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID numbers
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number: ");
                Integer IDNum = in.nextInt();
                students.put(IDNum, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\n\nClass roster:\n");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID Number: " + student.getKey() + "\nStudent Name: " + student.getValue() + "\n\n");
        }

    }
}
