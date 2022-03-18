package com.solvd.laba.homework3;

public class Protection extends Service implements IBudget{
    private Claimant claimant;
    private ThirdParty thirdParty;

    public Protection(){
    }

    public Protection(Lawyer lawyer, Client client, Claimant claimant, ThirdParty thirdParty){
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
}
