package com.solvd.laba.homework3;

public class Succession extends Service implements IBudget {
    private ThirdParty thirdParty;
    private Property property;

    public Succession(){
    }

    public Succession(Lawyer lawyer, Client client, ThirdParty thirdParty, Property property){
        super(lawyer, client);
        this.thirdParty = thirdParty;
        this.property = property;
    }

    public ThirdParty getThirdParty() {
        return this.thirdParty;
    }

    public void setThirdParty(ThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }


    @Override
    public double calculateBudget() {
        double budget;

        if (this.property.getDimension() < 30){
            budget = this.property.getValue() * 0.05;
            return budget;
        }
        budget = this.property.getValue() * 0.08;
        return budget;
    }

    @Override
    public String toString() {
        return "Service: succession \n" +
                super.toString() + "\n" +
                this.thirdParty + "\n" +
                this.property;
    }
}
