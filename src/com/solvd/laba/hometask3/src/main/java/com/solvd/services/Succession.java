package com.solvd.services;

import com.solvd.agents.Client;
import com.solvd.agents.Lawyer;
import com.solvd.agents.Property;
import com.solvd.agents.ThirdParty;
import com.solvd.collections.OfficeLawyers;
import com.solvd.exceptions.InvalidValue;
import com.solvd.interfaces.IBudgetable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Succession extends Service implements IBudgetable {
    private ThirdParty thirdParty;
    private Property property;

    public Succession() {
    }

    public Succession(Lawyer lawyer, Client client, ThirdParty thirdParty, Property property) {
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

        if (this.property.getDimension() < 30) {
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

    @Override
    public Lawyer assignLawyer(int option) {
        return new OfficeLawyers().getLawyerByOption(option);
    }

    @Override
    public Succession openCase(int option) {
        this.client = new Client().update();
        this.lawyer = assignLawyer(option);
        this.thirdParty = new ThirdParty().update();
        try {
            this.property = new Property().update();
        } catch (InvalidValue e) {
            Logger logger = LogManager.getLogger(Succession.class);
            logger.warn(e.getMessage());
        }

        return this;
    }
}
