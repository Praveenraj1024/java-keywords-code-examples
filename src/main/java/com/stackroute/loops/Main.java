package com.stackroute.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a single word to print its all characters: ");
        String word = scanner.next();
        new ForLoop().charPrinter(word);
        System.out.println("Enter a number between 1 to 100");
        int num = scanner.nextInt();
        new WhileAndDoWhileLoop().addingNumberToALimit(num);
        System.out.println("Do While loop starts....");
        new WhileAndDoWhileLoop().printingAndAddingNumberToALimit(num);
    }
}
