package com.company.Others;


public enum Season {
    WINTER(-25), SPRING(15), SUMMER(30) {
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(17) {};

    private double temp;

    Season(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}