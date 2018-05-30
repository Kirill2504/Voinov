package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;


public class SCarDemo {

    public static void main(String[] args) {
        Driver driver = new Driver("Ivanov", 34, 10);
        Engine engine = new Engine(243, "Mersedes");
        SportCar sportCar = new SportCar("Driver", " S", driver, engine, 544);
        Car car = new Car("Driver", " S", driver, engine);
        car.turnLeft();
        car.start();
        car.stop();
        car.turnRight();
        car.printInfo();

    }
}
