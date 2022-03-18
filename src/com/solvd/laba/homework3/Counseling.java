package com.solvd.laba.homework3;

public class Counseling extends Service implements IBudget {

    public Counseling() {
    }

    public Counseling(Lawyer lawyer, Client client) {
        super(lawyer, client);
    }


    @Override
    public double calculateBudget() {
        double budget;

        switch (this.lawyer.getSpeciality()) {
            case "labor":
                budget = 150;
                return budget;
            case "corporate":
                budget = 500;
                return budget;
            case "family":
                budget = 100;
                return budget;
            case "criminal":
                budget = 200;
                return budget;
            default:
                budget = 80;
                return budget;
        }
    }

    @Override
    public String toString() {
        return "Service: counseling \n" +
                super.toString();
    }
}
