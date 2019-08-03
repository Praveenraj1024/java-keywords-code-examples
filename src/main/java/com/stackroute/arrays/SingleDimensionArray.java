package com.stackroute.arrays;

/**
 * This class as a method to add elements of both array of same length.
 */
public class SingleDimensionArray {

    /**
     * @param array1 stores the first array,
     * @param array2 stores the second array
     *               This method prints the addition of elements in two arrays
     */
    public void singleDimensionArrayAdder(int[] array1, int[] array2){
         for (int i = 0; i < array1.length; i++){
             System.out.println(array1[i] + array2[i]);
         }
    }
}
