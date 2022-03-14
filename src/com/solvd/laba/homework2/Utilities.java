package com.solvd.laba.homework2;

import java.util.Scanner;

public abstract class Utilities {

    public static int[] readElements(int[] arrayElements) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the dimension of the array: ");

        int dimension = input.nextInt();
        input.nextLine();

        int[] elements = new int[dimension];
        System.out.println("Enter the elements: ");

        for (int pointer = 0; pointer < dimension; pointer++) {
            elements[pointer] = input.nextInt();
            input.nextLine();
        }

        input.close();
        return arrayElements = elements;
    }

    public static String[] readElements(String[] arrayElements) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the dimension of the array: ");

        int dimension = input.nextInt();
        input.nextLine();

        String[] elements = new String[dimension];
        System.out.println("Enter the elements: ");

        for (int pointer = 0; pointer < dimension; pointer++) {
            elements[pointer] = input.nextLine();
        }

        input.close();
        return arrayElements = elements;
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

    public static void printArray(String[] array) {
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
