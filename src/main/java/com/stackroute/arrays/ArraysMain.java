package com.stackroute.arrays;

import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of the arrays");
        int arraysLength = scanner.nextInt();
        int[] array1 = new int[arraysLength];
        int[] array2 = new int[arraysLength];
        System.out.println("Enter the values for First value");
        for (int i = 0; i < arraysLength; i++){
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter the values for Second value");
        for (int i = 0; i < arraysLength; i++){
            array2[i] = scanner.nextInt();
        }
        new SingleDimensionArray().singleDimensionArrayAdder(array1, array2);

        int[][] multiArray1 = new int[arraysLength][arraysLength];
        int[][] multiArray2 = new int[arraysLength][arraysLength];
        System.out.println("Enter values for First multidimension array: ");
        for (int i = 0; i < arraysLength; i++){
            for (int j = 0; j < arraysLength; j++){
                multiArray1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter values for Second multidimension array: ");
        for (int i = 0; i < arraysLength; i++){
            for (int j = 0; j < arraysLength; j++){
                multiArray2[i][j] = scanner.nextInt();
            }
        }
        new MultipleDimensionArray().multiplyerOfMultiDimensionArray(multiArray1, multiArray2);
    }
}
