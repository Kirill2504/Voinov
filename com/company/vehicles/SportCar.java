package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private double lastSpeed;

    public SportCar(String type, String aClass, Driver driver, Engine engine, double lastSpeed) {
        super(type, aClass, driver, engine);
        this.lastSpeed = lastSpeed;
    }

    public SportCar(double lastSpeed) {
        this.lastSpeed = lastSpeed;
    }

}
