package com.solvd.laba.homework3;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

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

    @Override
    public Property update() {
        Scanner input = new Scanner(System.in);

        //Property owner
        System.out.println("Property owner data: \n");
        this.owner = new ThirdParty().update();

        //Property data
        System.out.print("Enter property's value: ");
        this.setValue(parseDouble((input.nextLine())));
        System.out.print("Enter property's dimension: ");
        this.setDimension(input.nextInt());
        input.nextLine(); //Consume line

        //Property address update
        System.out.println("\nEnter property's address: ");
        this.address = new Address().update();

        return this;
    }
}
