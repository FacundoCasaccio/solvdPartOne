package com.solvd.interfaces;

import com.solvd.agents.Lawyer;

public interface IAssignable {

    Lawyer CRIMINAL_LAWYER = new Lawyer("John", "Wick", 32453876, 333666, "criminal");
    Lawyer LABOR_LAWYER = new Lawyer("Jim", "Carrey", 22200222, 220022, "labor");
    Lawyer FAMILY_LAWYER = new Lawyer("Homer", "Simpson", 64209, 64209, "family");
    Lawyer CORPORATE_LAWYER = new Lawyer("Steve", "Jobs", 99999999, 123789, "corporate");
    Lawyer CIVIL_LAWYER = new Lawyer("Steve", "Grant Rogers", 77398712, 127835, "civil");
    Lawyer BUSINESS_LAWYER = new Lawyer("Jeff", "Bezos", 90777111, 777777, "business");

    Lawyer assignLawyer(int option);
}
