package com.solvd.laba.homework3;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public abstract class RequestManager {

    public static Scanner input = new Scanner(System.in);

    //Default lawyers for testing
    private static final Lawyer CRIMINAL_LAWYER = new Lawyer("John", "Wick", 32453876, 333666, "criminal");
    private static final Lawyer LABOR_LAWYER = new Lawyer("Jim", "Carrey", 22200222, 220022, "labor");
    private static final Lawyer FAMILY_LAWYER = new Lawyer("Homer", "Simpson", 64209, 64209, "family");
    private static final Lawyer CORPORATE_LAWYER = new Lawyer("Steve", "Jobs", 99999999, 123789, "corporate");
    private static final Lawyer CIVIL_LAWYER = new Lawyer("Steve", "Grant Rogers", 77398712, 127835, "civil");
    private static final Lawyer BUSINESS_LAWYER = new Lawyer("Jeff", "Bezos", 90777111, 777777, "business");

    public static Lawyer assignLawyer(int option) {
        Lawyer lawyer;

        switch (option) {
            case 1:
                lawyer = CRIMINAL_LAWYER;
                break;
            case 2:
                lawyer = LABOR_LAWYER;
                break;
            case 3:
                lawyer = FAMILY_LAWYER;
                break;
            case 4:
                lawyer = CORPORATE_LAWYER;
                break;
            case 5:
                lawyer = CIVIL_LAWYER;
                break;
            case 6:
                lawyer = BUSINESS_LAWYER;
                break;
            default:
                return null;
        }
        return lawyer;
    }

    public static Client updateClient() {
        Client client = new Client();

        //Client personal data
        System.out.print("Enter client name: ");
        client.setName(input.nextLine());
        System.out.print("Enter client surname: ");
        client.setSurname(input.nextLine());
        System.out.print("Enter client Id number: ");
        client.setPersonalId(input.nextInt());
        input.nextLine(); //Consume line

        //Client address update
        System.out.println("\nEnter client Address: ");
        client.setAddress(updateAddress());

        return client;
    }

    public static Claimant updateClaimant() {
        Claimant claimant = new Claimant();
        Lawyer lawyer = new Lawyer();

        //Claimant personal data
        System.out.print("Enter claimant name: ");
        claimant.setName(input.nextLine());
        System.out.print("Enter claimant surname: ");
        claimant.setSurname(input.nextLine());
        System.out.print("Enter claimant Id number: ");
        claimant.setPersonalId(input.nextInt());
        input.nextLine(); //Consume line

        //Claimant address update
        System.out.println("\nEnter claimant Address: ");
        claimant.setAddress(updateAddress());

        //Claimant lawyer
        System.out.print("Enter claimant lawyer name: ");
        lawyer.setName(input.nextLine());
        System.out.print("Enter claimant lawyer surname: ");
        lawyer.setSurname(input.nextLine());
        System.out.print("Enter claimant lawyer speciality: ");
        lawyer.setSpeciality(input.nextLine());
        System.out.print("Enter claimant lawyer enrollment: ");
        lawyer.setEnrollment(input.nextInt());
        input.nextLine();//Consume line
        System.out.println();

        //Claimant lawyer update
        claimant.setLawyer(lawyer);

        return claimant;
    }

    public static ThirdParty updateThirdParty() {
        ThirdParty thirdParty = new ThirdParty();

        //ThirdParty personal data
        System.out.print("Enter Third party name: ");
        thirdParty.setName(input.nextLine());
        System.out.print("Enter Third party surname: ");
        thirdParty.setSurname(input.nextLine());
        System.out.print("Enter Third party role: ");
        thirdParty.setRole(input.nextLine());
        System.out.print("Enter Third party Id number: ");
        thirdParty.setPersonalId(input.nextInt());
        input.nextLine(); //Consume line

        //ThirdParty address update
        System.out.println("\nEnter Third party Address: ");
        thirdParty.setAddress(updateAddress());

        return thirdParty;
    }

    public static Property updateProperty() {
        ThirdParty owner;
        Property property = new Property();

        //Property owner
        System.out.println("Property owner data: \n");
        owner = updateThirdParty();
        property.setOwner(owner);

        //Property data
        System.out.print("Enter property's value: ");
        property.setValue(parseDouble((input.nextLine())));
        System.out.print("Enter property's dimension: ");
        property.setDimension(input.nextInt());
        input.nextLine(); //Consume line

        //Property address update
        System.out.println("\nEnter property's address: ");
        property.setAddress(updateAddress());

        return property;
    }

    public static Address updateAddress() {
        Address address = new Address();

        System.out.print("Country: ");
        address.setCountry(input.nextLine());
        System.out.print("State: ");
        address.setState(input.nextLine());
        System.out.print("City: ");
        address.setCity(input.nextLine());
        System.out.print("Street: ");
        address.setStreet(input.nextLine());
        System.out.print("Number: ");
        address.setNumber(input.nextInt());
        input.nextLine(); //Consume line
        System.out.println();

        return address;
    }

}
