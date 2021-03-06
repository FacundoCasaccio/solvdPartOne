package com.solvd.laba.hometask2;

import java.util.Scanner;

public abstract class Utilities {

    //Read array from input
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

    //Overloaded method for array of Strings
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

    //Print array on console
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

    //Overloaded method for array of strings
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
