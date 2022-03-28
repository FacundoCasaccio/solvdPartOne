package com.solvd.handlers;

import com.solvd.agents.Property;
import com.solvd.collections.OfficeClients;
import com.solvd.exceptions.InvalidArea;
import com.solvd.exceptions.InvalidService;
import com.solvd.services.Counseling;
import com.solvd.services.Protection;
import com.solvd.services.Succession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    //Logger
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        int option = 0;
        Ticket ticket;
        OfficeClients clients = new OfficeClients();

        //Welcome message
        System.out.println("Welcome to Law office \n");

        //Service selection
        Menu.services();
        try {
            option = Menu.selectService();
        } catch (InvalidService e) {
            LOGGER.warn(e.getMessage());
        }


        switch (option) {
            case 1:
                //Capture option
                Menu.area();
                try {
                    option = Menu.selectArea();
                } catch (InvalidArea e) {
                    LOGGER.warn(e.getMessage());
                }

                //Service creation
                Counseling counseling = new Counseling().openCase(option);
                //Add client to clients list
                clients.addClient(counseling.getClient());
                //Ticket creation
                ticket = new Ticket(counseling);
                //Print ticket
                ticket.print();
                break;

            case 2:
                //Capture option
                Menu.area();
                //Capture option
                Menu.area();
                try {
                    option = Menu.selectArea();
                } catch (InvalidArea e) {
                    LOGGER.warn(e.getMessage());
                }

                //Service creation
                Protection protection = new Protection().openCase(option);
                //Add client to clients list
                clients.addClient(protection.getClient());
                //Ticket creation
                ticket = new Ticket(protection);
                //Print ticket
                ticket.print();
                break;

            case 3:
                //Service creation
                Succession succession = new Succession().openCase(option);
                //Add client to clients list
                clients.addClient(succession.getClient());
                //Ticket creation
                ticket = new Ticket(succession);
                //Print ticket
                ticket.print();
                break;
        }



    }
}

