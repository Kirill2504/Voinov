package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;


public class Lorry extends Car {
    private double weight;
/*
    public Lorry(String type, String aClass, Driver driver, Engine engine, double weight) {
        super(type, aClass, driver, engine);
        this.weight = weight;
    }*/

    public class Car {
        private String type, aClass;
        private Driver driver;
        private Engine engine;

        public Car(String type, String aClass, Driver driver, Engine engine) {
            this.type = type;
            this.aClass = aClass;
            this.driver = driver;
            this.engine = engine;
        }

        public Car() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getaClass() {
            return aClass;
        }

        public void setaClass(String aClass) {
            this.aClass = aClass;
        }

        public Driver getDriver() {
            return driver;
        }

        public void setDriver(Driver driver) {
            this.driver = driver;
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public void start() {
            System.out.println("I'am starting");
        }

        public void stop() {
            System.out.println("I'am stoping");
        }

        public void turnRight() {
            System.out.println("I'am turning right");
        }

        public void turnLeft() {
            System.out.println("I'am turning left");
        }

        public void printInfo() {
            System.out.println(type + aClass + driver.getAge());
        }
    }

    public Lorry(double weight) {
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}