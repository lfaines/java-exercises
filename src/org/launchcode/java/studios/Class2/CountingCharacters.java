package org.launchcode.java.studios.Class2;
import java.util.HashMap;
import java.util.Map;

/** TODO: Write a program that calculates the number of times each character occurs in a string and
 * prints these counts to the console. You could get the string as input from the user, but for the sake of simplicity,
 * you may also hard-code the string into your program as the value of a variable.
 * */

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> counting = new HashMap<>();
        String msg = "Hello World Yall!";

        /** iterate through each letter in string, return characters as an array */
        for (char c : msg.toCharArray()) {
            /** check to see if char in dictionary and add 1 for each char found*/
            if (counting.containsKey(c))
                counting.put(c, counting.get(c) + 1);
            /** if char not in dictionary add it and initialize it to 1*/
            else {
                counting.put(c, 1);
            }
        }
        /** print out the keys and values side by side via iteration */
        for (Map.Entry<Character, Integer> eachCount: counting.entrySet()) {
            System.out.println(eachCount.getKey() + ":" + eachCount.getValue());
        }
    }
}