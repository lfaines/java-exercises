package exercises.ClassPrep2;

/** ArrayList Exercise #1 - Unit 3.2 Class Prep
 * TODO: Write a static method to find the sum of all the even numbers in a list.
 * Within main, create a list with at least 10 integers and call your method on the list.
 */

public class SumEven {
    public static void main(String[] args) {
        // create an array with 10 numbers
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

        // get all even numbers from the list and add them together
        int sumEven = 0;
        for (Integer num : number)
        if (num % 2 == 0)
        sumEven += num;
        System.out.println("The sum of all even numbers is " + sumEven);
            }

        }





