package com.company;


public class Aspirant extends Student {
    private int work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, int work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }
}
