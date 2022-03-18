package com.solvd.laba.homework3;

public class Property extends Asset {
    private Address address;
    private double dimension;

    public Property() {
    }

    public Property(double value, ThirdParty owner, Address address, double dimension) {
        super (value, owner);
        this.address = address;
        this.dimension = dimension;
    }

    public Address getAddress() {
        return this.address;
    }

    public double getDimension() {
        return this.dimension;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Property: \n" + super.toString() + ", dimension: " +
                this.dimension + "m2\nProperty " +
                this.address;
    }
}
