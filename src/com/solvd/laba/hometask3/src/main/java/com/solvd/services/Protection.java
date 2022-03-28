package com.solvd.services;

import com.solvd.agents.Claimant;
import com.solvd.agents.Client;
import com.solvd.agents.Lawyer;
import com.solvd.agents.ThirdParty;
import com.solvd.collections.OfficeLawyers;
import com.solvd.handlers.Main;
import com.solvd.interfaces.IBudgetable;

public class Protection extends Service implements IBudgetable {
    private Claimant claimant;
    private ThirdParty thirdParty;

    public Protection() {
    }

    public Protection(Lawyer lawyer, Client client, Claimant claimant, ThirdParty thirdParty) {
        super(lawyer, client);
        this.claimant = claimant;
        this.thirdParty = thirdParty;
    }


    public Claimant getClaimant() {
        return this.claimant;
    }

    public void setClaimant(Claimant claimant) {
        this.claimant = claimant;
    }

    public ThirdParty getThirdParty() {
        return this.thirdParty;
    }

    public void setThirdParty(ThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    @Override
    public double calculateBudget() {
        double budget;

        switch (this.lawyer.getSpeciality()) {
            case "labor", "civil", "business":
                budget = 400;
                return budget;
            case "family":
                budget = 380;
                return budget;
            case "criminal":
                budget = 600;
                return budget;
            case "corporate":
                budget = 1000;
                return budget;
            default:
                budget = 250;
                return budget;
        }
    }

    @Override
    public String toString() {
        return "Service: protection \n" +
                super.toString() + "\n" +
                this.claimant + "\n" +
                this.thirdParty;
    }

    @Override
    public Lawyer assignLawyer(int option) {
        return Main.LAWYERS.getLawyerByOption(option);
    }

    @Override
    public Protection openCase(int option) {
        this.client.update();
        this.lawyer = assignLawyer(option);
        this.claimant.update();
        this.thirdParty.update();
        return this;
    }
}
