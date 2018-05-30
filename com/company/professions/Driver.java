package com.company.professions;

/**
 * Created by Student on 30.05.2018.
 */
public class Driver extends Persons {
    private int exp;

    public Driver(String fuelname, int age, int exp) {
        super(fuelname, age);
        this.exp = exp;
    }

    public Driver() {
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
