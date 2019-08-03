package com.stackroute.conditionalstatements;

/**
 * This class a behaviour like checking stage by age,
 *
 * For that conditional statements like if, if-else, nested if-else and if-else ladder
 */
public class IfElseStatements {

    /**
     * @param age stores the age of type int for which we need to print the stage like
     *            baby, boy etc....
     */
    public void ageChecker(int age){
        if (age >= 0){
            if (age < 60) {
                if (age >= 0 && age <= 5) {
                    System.out.println("Small Baby");
                }
                else if (age > 5 && age < 15) {
                    System.out.println("Boy");
                }
                else if (age > 15 && age < 25){
                    System.out.println("Adult");
                }
                else{
                    System.out.println("Man");
                }
            }
            else {
                System.out.println("Old man");
            }
        }
        else {
            System.out.println("Age should be greater than zero");
        }
    }


}
