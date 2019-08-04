package com.stackroute.numbersandstrings;


public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
//        Integer integer = new Integer(100);
        Integer integer = new Integer(10);
        // unboxing the Object
        int intNum = integer;

        System.out.println("Value of Integer: " + integer);
        System.out.println("Value of intNum: " + intNum);

        //Autoboxing of char
        Character character = 'a';

        // Auto-unboxing of Character
        char ch = character;
        System.out.println("Value of char: " + ch);
        System.out.println("Value of Character " + character);

    }
}