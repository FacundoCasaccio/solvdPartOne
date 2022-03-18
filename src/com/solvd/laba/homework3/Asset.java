package com.solvd.laba.homework3;

public abstract class Asset {
    protected double value;
    protected ThirdParty owner;

    public Asset() {
    }

    public Asset(double value, ThirdParty owner) {
        this.value = value;
        this.owner = owner;
    }

    public double getValue() {
        return this.value;
    }

    public ThirdParty getOwner() {
        return this.owner;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setOwner(ThirdParty owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.owner + "\nValue: $" + this.value;
    }
}
