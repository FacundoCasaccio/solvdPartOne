package com.solvd.laba.homework3;

public class Lawyer extends Person {
    private int enrollment;
    private String speciality;

    public Lawyer() {
    }

    public Lawyer(String name, String surname, int personalId, int enrollment, String speciality) {
        super(name, surname, personalId);
        this.enrollment = enrollment;
        this.speciality = speciality;
    }

    public int getEnrollment() {
        return this.enrollment;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Lawyer: " + super.toString() + "\nEnrollment: " +
                this.enrollment + ", speciality: " + this.speciality + "\n";
    }
}
