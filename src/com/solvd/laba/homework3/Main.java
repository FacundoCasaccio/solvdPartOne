package com.solvd.laba.homework3;

public class Main {
    public static void main(String[] args) {
        int option;
        Ticket ticket;
        Lawyer lawyer;
        Client client;
        ThirdParty thirdParty;

        //Welcome message
        System.out.println("Welcome to Law office \n");

        //Service selection
        Menu.services();
        option = Menu.selectOption();

        switch (option) {
            case 1:
                Menu.area();
                option = Menu.selectOption();

                //Lawyer assignation
                lawyer = RequestManager.assignLawyer(option);
                //Client data input
                client = RequestManager.updateClient();

                //Ticket creation
                ticket = new Ticket(lawyer, client);

                //Print ticket
                System.out.println(ticket);
                break;

            case 2:
                Claimant claimant;

                Menu.area();
                option = Menu.selectOption();

                //Lawyer assignation
                lawyer = RequestManager.assignLawyer(option);
                //Client data input
                client = RequestManager.updateClient();
                //Claimant data input
                claimant = RequestManager.updateClaimant();
                //ThirdParty data input
                thirdParty = RequestManager.updateThirdParty();

                //Ticket creation
                ticket = new Ticket(lawyer, client, claimant, thirdParty);

                //Print ticket
                System.out.println(ticket);
                break;

            case 3:
                Property property;

                //Lawyer assignation
                lawyer = RequestManager.assignLawyer(option);
                //Client data input
                client = RequestManager.updateClient();
                //ThirdParty data input
                thirdParty = RequestManager.updateThirdParty();
                //Property data input
                property = RequestManager.updateProperty();

                //Ticket creation
                ticket = new Ticket(lawyer, client, thirdParty, property);

                //Print ticket
                System.out.println(ticket);
                break;
        }

    }
}

