package com.solvd.laba.homework3;

public class ThirdParty extends Person {
    private String role;
    private Address address;

    public ThirdParty() {
    }

    public ThirdParty(String name, String surname, int personalId, String role, Address address) {
        super(name, surname, personalId);
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  this.role + ": " +
                super.toString() + "\n" +
                "Address: " + this.address + "\n";
    }
}
