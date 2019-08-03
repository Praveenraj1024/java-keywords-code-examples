package com.stackroute.conditionalstatements;

import java.util.Scanner;

/**
 * This class holds the main method,
 */
public class Main {
    /**
     * @param args stores the array of String,
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the age to check the stage of that person: ");
        int age = scanner.nextInt();
        new IfElseStatements().ageChecker(age);
        System.out.println("Please enter the rank number to display the actor name: ");
        int rank = scanner.nextInt();
        new SwitchStatements().nameDisplayer(rank);

    }
}
