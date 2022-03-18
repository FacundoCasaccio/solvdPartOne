package com.solvd.laba.homework3;

public class Ticket {
    private Service service;
    private double budget;
    private static int ticketId;

    public Ticket() {
        ticketId++;
    }

    //Counseling ticket constructor
    public Ticket(Lawyer lawyer, Client client) {
        ticketId++;
        IBudget serviceImpl = new Counseling(lawyer, client);

        this.service = new Counseling(lawyer, client);
        this.budget = serviceImpl.calculateBudget();
    }

    //Protection ticket constructor
    public Ticket(Lawyer lawyer, Client client, Claimant claimant, ThirdParty thirdParty) {
        ticketId++;
        IBudget serviceImpl = new Protection(lawyer, client, claimant, thirdParty);

        this.service = new Protection(lawyer, client, claimant, thirdParty);
        this.budget = serviceImpl.calculateBudget();
    }

    //Succession ticket constructor
    public Ticket(Lawyer lawyer, Client client, ThirdParty thirdParty, Property property) {
        ticketId++;
        IBudget serviceImpl = new Succession(lawyer, client, thirdParty, property);

        this.service = new Succession(lawyer, client, thirdParty, property);
        this.budget = serviceImpl.calculateBudget();
    }

    public Service getService() {
        return this.service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void displayTicket() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "\n\nTicket " + ticketId + "\n" +
                this.service + "\n\n\n" +
                "Budget=" + this.budget;
    }
}
