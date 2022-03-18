package com.solvd.laba.homework3;

public class Client extends Person {
    private static int clientId;
    private Address address;

    public Client(String name, String surname, int personalId, Address address) {
        super(name, surname, personalId);

        clientId++;
        this.address = address;
    }

    public Client() {
        clientId++;
    }

    public int getClientId() {
        return clientId;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client: " + super.toString() + "\n" + this.address + "\n";
    }
}
