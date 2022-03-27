package com.solvd.laba.homework3;

public class Counseling extends Service implements IBudgetable {

    public Counseling() {
    }

    public Counseling(Lawyer lawyer, Client client) {
        super(lawyer, client);
    }

    public Counseling(Client client) {
        super(client);
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

    @Override
    public Lawyer assignLawyer(int option) {
        Lawyer lawyer;

        switch (option) {
            case 1:
                lawyer = CRIMINAL_LAWYER;
                break;
            case 2:
                lawyer = LABOR_LAWYER;
                break;
            case 3:
                lawyer = FAMILY_LAWYER;
                break;
            case 4:
                lawyer = CORPORATE_LAWYER;
                break;
            case 5:
                lawyer = CIVIL_LAWYER;
                break;
            case 6:
                lawyer = BUSINESS_LAWYER;
                break;
            default:
                return null;
        }
        return lawyer;
    }

    @Override
    public Counseling openCase(int option) {
        this.client = new Client().update();
        this.lawyer = assignLawyer(option);
        return this;
    }
}
