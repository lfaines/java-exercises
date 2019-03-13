package exercises.ClassPrep2;

/** ArrayList and Strings Exercise #2 - Unit 3.2 Class Prep
 * TODO: Write a static method to print out each word in a list that has exactly 5 letters.
 */

public class Words {
    public static void main(String[] args) {
        String[] words = {"bacon", "sausage", "cheese", "house", "car", "micro", "heaven"};
        int wordLength = Integer.parseInt("5");
        for(String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
