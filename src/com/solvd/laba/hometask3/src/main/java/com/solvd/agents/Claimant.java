package com.solvd.agents;

import java.util.Scanner;

public class Claimant extends Person {
    private Address address;
    private Lawyer lawyer;

    public Claimant() {
    }

    public Claimant(String name, String surname, int personalId, Address address, Lawyer lawyer) {
        super(name, surname, personalId);

        this.address = address;
        this.lawyer = lawyer;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Lawyer getLawyer() {
        return this.lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    @Override
    public String toString() {
        return "Claimant: " + super.toString() + "\n" +
                this.address + "\n" +
                this.lawyer + "\n";
    }


    @Override
    public Claimant update() {
        Scanner input = new Scanner(System.in);

        //Claimant personal data
        System.out.print("Enter claimant name: ");
        this.setName(input.nextLine());
        System.out.print("Enter claimant surname: ");
        this.setSurname(input.nextLine());
        System.out.print("Enter claimant Id number: ");
        this.setPersonalId(input.nextInt());
        input.nextLine(); //Consume line

        //Claimant address update
        System.out.println("\nEnter claimant Address: ");
        this.address = new Address().update();

        //Claimant lawyer update
        this.lawyer = new Lawyer().update();

        return this;
    }
}
