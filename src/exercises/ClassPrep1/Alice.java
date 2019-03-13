package exercises.ClassPrep1;

/**
 * Strings Exercise #4 - Unit 3.1 Class Prep
 */

public class Alice {
    public static void main(String[] args) {
        //variable set as data type string that will be searched for the term the user inputs
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        //initiate acceptance of user input applicable to lines 12 and 13
        java.util.Scanner in = new java.util.Scanner(System.in); //don't forget must use keyword "new" to make qualifier an expression according to error message
        System.out.println("What is your name? "); //prints to the screen for the user to see
        String name = in.next(); //accepts user input as data type string
        System.out.println(name + ", type 1 word to see if it shows up in the first " +
                "sentence from Alice in Wonderland. "); //prints to the screen for the user to see
        String term = in.next().toLowerCase(); // accepts user input as data type string
        System.out.println(sentence.contains(term));
        //if-else conditional block
        if (sentence.toUpperCase().contains(term.toUpperCase())) //evaluates whether the term is in the sentence regardless of casing
            System.out.println("Great, " + name + " you followed directions exactly! " +
                    "The word " + "*" + term + "*" + " appears in the sentence."); //prints final response to user based on the term the user
            //entered onto the screen
        else
            System.out.println("Nope, the word " + "*" + term + "*" + " is not in the first sentence of Alice in Wonderland. Try again.");


    }
}


