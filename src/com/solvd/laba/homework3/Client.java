package com.solvd.laba.homework3;

import java.util.Scanner;

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

    @Override
    public Client update() {
        Scanner input = new Scanner(System.in);

        //Client personal data
        System.out.print("Enter client name: ");
        this.setName(input.nextLine());
        System.out.print("Enter client surname: ");
        this.setSurname(input.nextLine());
        System.out.print("Enter client Id number: ");
        this.setPersonalId(input.nextInt());
        input.nextLine(); //Consume line

        //Client address update
        System.out.println("\nEnter client Address: ");
        this.address = new Address().update();

        return this;
    }
}
