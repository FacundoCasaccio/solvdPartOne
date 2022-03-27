package com.solvd.laba.hometask3.src.main.java.com.solvd.handlers;

import com.solvd.laba.hometask3.src.main.java.com.solvd.agents.Property;
import com.solvd.laba.hometask3.src.main.java.com.solvd.services.Counseling;
import com.solvd.laba.hometask3.src.main.java.com.solvd.services.Protection;
import com.solvd.laba.hometask3.src.main.java.com.solvd.services.Succession;

public class Main {
    public static void main(String[] args) {
        int option;
        Ticket ticket;

        //Welcome message
        System.out.println("Welcome to Law office \n");

        //Service selection
        Menu.services();
        option = Menu.selectOption();

        switch (option) {
            case 1:
                //Capture option
                Menu.area();
                option = Menu.selectOption();
                //Service creation
                Counseling counseling = new Counseling().openCase(option);
                //Ticket creation
                ticket = new Ticket(counseling);
                //Print ticket
                ticket.print();
                break;

            case 2:
                //Capture option
                Menu.area();
                option = Menu.selectOption();

                //Service creation
                Protection protection = new Protection().openCase(option);
                //Ticket creation
                ticket = new Ticket(protection);
                //Print ticket
                ticket.print();
                break;

            case 3:
                //Service creation
                Succession succession = new Succession().openCase(option);
                Property property;
                //Ticket creation
                ticket = new Ticket(succession);
                //Print ticket
                ticket.print();
                break;
        }

    }
}

