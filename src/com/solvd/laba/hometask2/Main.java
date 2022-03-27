package com.solvd.laba.hometask2;

public class Main {
    public static void main(String[] args) {

        //Welcome message
        System.out.println("Welcome to quicksort");

        Menu.displayMenu();
        int option = Menu.selection(); //Get selected option

        switch (option) {
            //array of numbers options
            case 1, 2 -> {
                NumberArray numberArray = new NumberArray(); //Initialize array of numbers

                //Assign array elements from user input
                numberArray.setElements(Utilities.readElements(numberArray.getElements()));
                //Print initial value
                System.out.print("Before: ");
                Utilities.printArray(numberArray.getElements());

                //Run sorting algorithm
                if (option == 1) {
                    QuickSort.SortUpwards(numberArray.getElements(), 0, numberArray.getElements().length - 1);
                } else {
                    QuickSort.SortDownwards(numberArray.getElements(), 0, numberArray.getElements().length - 1);
                }

                //Print result
                System.out.print("After: ");
                Utilities.printArray(numberArray.getElements());
            }

            //array of Strings option
            case 3, 4 -> {
                LetterArray letterArray = new LetterArray();

                //Assign array elements from user input
                letterArray.setElements(Utilities.readElements(letterArray.getElements()));
                //Print initial value
                System.out.print("Before: ");
                Utilities.printArray(letterArray.getElements());

                //Run sorting algorithm
                if (option == 3) {
                    QuickSort.SortUpwards(letterArray.getElements(), 0, letterArray.getElements().length - 1);
                } else {
                    QuickSort.SortDownwards(letterArray.getElements(), 0, letterArray.getElements().length - 1);
                }

                //Print result
                System.out.print("After: ");
                Utilities.printArray(letterArray.getElements());
            }
        }

    }
}
