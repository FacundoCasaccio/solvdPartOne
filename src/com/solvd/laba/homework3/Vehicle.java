package com.solvd.laba.homework3;

public class Vehicle extends Asset{
    private String enrollment;
    private String category;

    public Vehicle() {}

    public String getEnrollment() {
        return this.enrollment;
    }

    public String getCategory() {
        return this.category;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
