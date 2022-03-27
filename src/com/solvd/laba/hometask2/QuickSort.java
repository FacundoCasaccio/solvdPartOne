package com.solvd.laba.hometask2;

public abstract class QuickSort {

    //Numeric algorithms
    public static void SortUpwards(int[] array, int lowIndex, int highIndex) {

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
        SortUpwards(array, lowIndex, leftPointer - 1);

        //Recursion for the right-most part of the array
        SortUpwards(array, leftPointer + 1, highIndex);
    }

    public static void SortDownwards(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // Partition the array (left: lower than pivot / right:higher than pivot)
        while (leftPointer < rightPointer) {
            while (array[leftPointer] >= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] <= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }
            swapElements(array, leftPointer, rightPointer);
        }

        //Set pivot in place
        swapElements(array, leftPointer, highIndex);

        //Recursion for the left-most part of the array
        SortDownwards(array, lowIndex, leftPointer - 1);

        //Recursion for the right-most part of the array
        SortDownwards(array, leftPointer + 1, highIndex);
    }

    //Overloaded methods for strings
    public static void SortUpwards(String[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        String pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // Partition the array (left: lower than pivot / right:higher than pivot)
        while (leftPointer < rightPointer) {
            while (array[leftPointer].compareToIgnoreCase(pivot) <= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer].compareToIgnoreCase(pivot) >= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }
            swapElements(array, leftPointer, rightPointer);
        }

        //Set pivot in place
        swapElements(array, leftPointer, highIndex);

        //Recursion for the left-most part of the array
        SortUpwards(array, lowIndex, leftPointer - 1);

        //Recursion for the right-most part of the array
        SortUpwards(array, leftPointer + 1, highIndex);
    }

    public static void SortDownwards(String[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        String pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // Partition the array (left: lower than pivot / right:higher than pivot)
        while (leftPointer < rightPointer) {
            while (array[leftPointer].compareToIgnoreCase(pivot) >= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[leftPointer].compareToIgnoreCase(pivot) <= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }
            swapElements(array, leftPointer, rightPointer);
        }

        //Set pivot in place
        swapElements(array, leftPointer, highIndex);

        //Recursion for the left-most part of the array
        SortDownwards(array, lowIndex, leftPointer - 1);

        //Recursion for the right-most part of the array
        SortDownwards(array, leftPointer + 1, highIndex);
    }

    //Swap numeric elements
    private static void swapElements(int[] array, int lower, int higher) {
        int savedValue = array[lower];
        array[lower] = array[higher];
        array[higher] = savedValue;
    }

    //Overload - swap string elements
    private static void swapElements(String[] array, int lower, int higher) {
        String savedValue = array[lower];
        array[lower] = array[higher];
        array[higher] = savedValue;
    }

}
