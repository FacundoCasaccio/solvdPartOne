package com.solvd.laba.homework3;

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
    public String toString(){
        return "Claimant: " + super.toString() + "\n" +
                this.address + "\n" +
                this.lawyer + "\n";
    }
}
