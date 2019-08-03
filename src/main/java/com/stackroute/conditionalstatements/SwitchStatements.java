package com.stackroute.conditionalstatements;

/**
 * This class as a behaviour like displaying the actor name for given rank (
 * based on the pre business  in Tamil Nadu state.
 */
public class SwitchStatements {

    /**
     * @param rank stores the rank of an Kollywood actor, depending upon that rank,
     *             this method will print the name of that actor.
     */
    public void nameDisplayer(int rank){
        switch (rank){
            case 1: {
                System.out.println("Rajini");
                break;
            }
            case 2: {
                System.out.println("Vijay");
                break;
            }
            case 3: {
                System.out.println("Ajith");
                break;
            }
            case 4: {
                System.out.println("Kamal");
                break;
            }
            case 5: {
                System.out.println("Suriya");
                break;
            }
            case 6: {
                System.out.println("Sivakarthikeyan");
                break;
            }
            case 7: {
                System.out.println("Dhanush");
                break;
            }
            case 8: {
                System.out.println("Vikram");
                break;
            }
            case 9: {
                System.out.println("Karthi");
                break;
            }
            case 10: {
                System.out.println("VijaySethupathi");
                break;
            }
            default: {
                System.out.println("Please enter between 1 and 10");
                break;
            }

        }
    }
}
