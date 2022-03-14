package com.solvd.laba.homework1;

import java.util.Scanner;

public class quickSortFirstHomework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimension = 0;

        System.out.println("Welcome to QuickSort \n\n");
        System.out.print("Please enter the dimension of the array: ");

        dimension = input.nextInt();
        input.nextLine();
        int array[] = new int[dimension];

        System.out.println("Enter the numbers: ");

        for (int pointer = 0; pointer < dimension; pointer++) {
            array[pointer] = input.nextInt();
            input.nextLine();
        }

        input.close();

        System.out.print("Before: ");
        printArray(array);

        quickSort(array, 0, array.length - 1);
        System.out.print("After: ");
        printArray(array);

    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // Partition the array (left: lower than pivot / right:higher than pivot)
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }
            swapElements(array, leftPointer, rightPointer);
        }

        //Set pivot in place
        swapElements(array, leftPointer, highIndex);

        //Recursion for the left-most part of the array
        quickSort(array, lowIndex, leftPointer - 1);

        //Recursion for the right-most part of the array
        quickSort(array, leftPointer + 1, highIndex);
    }

    public static void swapElements(int[] array, int lower, int higher) {
        int savedValue = array[lower];
        array[lower] = array[higher];
        array[higher] = savedValue;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int pointer = 0; pointer < array.length; pointer++) {
            if (pointer + 1 == array.length) {
                System.out.print(array[pointer] + " ]");
            } else {
                System.out.print(array[pointer] + ", ");
            }
        }
        System.out.println();
    }
}
