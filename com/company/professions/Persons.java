package com.company.professions;


public class Persons {
    private String fuelname;
    private int age;

    public Persons(String fuelname, int age) {
        this.fuelname = fuelname;
        this.age = age;
    }

    public Persons() {
    }

    public String getFuelname() {
        return fuelname;
    }

    public void setFuelname(String fuelname) {
        this.fuelname = fuelname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
