package com.solvd.agents;

import java.util.Scanner;

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
        return this.role + ": " +
                super.toString() + "\n" +
                "Address: " + this.address + "\n";
    }

    @Override
    public ThirdParty update() {
        Scanner input = new Scanner(System.in);

        //ThirdParty personal data
        System.out.print("Enter Third party name: ");
        this.setName(input.nextLine());
        System.out.print("Enter Third party surname: ");
        this.setSurname(input.nextLine());
        System.out.print("Enter Third party role: ");
        this.setRole(input.nextLine());
        System.out.print("Enter Third party Id number: ");
        this.setPersonalId(input.nextInt());
        input.nextLine(); //Consume line

        //ThirdParty address update
        System.out.println("\nEnter Third party Address: ");
        this.address = new Address().update();

        return this;
    }
}
