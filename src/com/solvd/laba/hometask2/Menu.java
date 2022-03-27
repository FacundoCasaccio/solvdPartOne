package com.solvd.laba.hometask2;

import java.util.Scanner;

public abstract class Menu {

    //Menu display
    public static void displayMenu() {
        System.out.println(
                "1- Sort array of numbers upwards \n " +
                "2- Sort array of numbers downwards \n" +
                "3- Sort array of letters upwards \n" +
                "4- Sort array of letters downwards");
    }

    //Select menu option
    public static int selection(){
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        input.nextLine(); //Consume line

        return option;
    }



}
