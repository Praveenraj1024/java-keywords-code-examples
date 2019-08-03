package com.stackroute.loops;

/**
 * This class as metods which uses while and do-while loop.
 */
public class WhileAndDoWhileLoop {

    /**
     * @param num stores a value of type int.
     *            This method should check and print num till it reach the limit.
     */
    public void addingNumberToALimit(int num){
        while (num < 100){
            System.out.println("Current value is " + num);
            num += 10;
        }
    }

    /**
     * @param num stores the value of type int,
     *            This method should print and check till it reach the limit.
     *
     */
    public void printingAndAddingNumberToALimit(int num){
        do {
            System.out.println("Current value is " + num);
            num += 10;
        } while (num < 100);
    }
}
