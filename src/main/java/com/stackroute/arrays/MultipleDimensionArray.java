package com.stackroute.arrays;

/**
 * This class as a method to multiple two multiple array.
 */
public class MultipleDimensionArray {

    /**
     * @param array1 stores the int type values in array form.
     * @param array2 stores the int type values in array form.
     */
    public void multiplyerOfMultiDimensionArray(int[][] array1, int[][] array2){
        int[][] multipliedArray = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array1[i].length; k++) {
                int num = 0;
                for (int j = 0; j < array1[i].length; j++) {
                    num += array1[i][k] * array2[j][k];
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
