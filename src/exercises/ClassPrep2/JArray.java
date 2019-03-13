package exercises.ClassPrep2;

/** Arrays Exercise #3 - Unit 3.2 Class Prep
 * TODO: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
 * Then loop through the array and print out each value.
 * */

public class JArray {
    public static void main(String[] args) {
        Integer[] numbers = {1, 1, 2, 3, 5, 8};

        // Print all the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

    }
}
