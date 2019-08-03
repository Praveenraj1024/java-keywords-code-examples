package com.stackroute.loops;

/**
 * This class as a method to print each and every character of a sequence of character.
 */
public class ForLoop {
    /**
     * @param word stores the sequence of character,
     *             This method prints the each char placed in the sequence of character.
     */
    public void charPrinter(String word){
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
