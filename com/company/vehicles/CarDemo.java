package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/**
 * Created by Student on 30.05.2018.
 */
public class CarDemo {

    public static void main(String[] args) {
        Driver driver = new Driver("Ivanov", 34, 10);
        Engine engine = new Engine(243, "Mersedes");
        Car car = new Car("Driver", " S", driver, engine);
        car.turnLeft();
        car.start();
        car.stop();
        car.turnRight();
        System.out.println(car);
    }
}
