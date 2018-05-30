package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class LorryDemo {
    public static void main(String[] args) {
        Lorry lorry = new Lorry(345);
        Driver driver = new Driver("Ivanov", 34, 10);
        Engine engine = new Engine(243, "Mersedes");
    }

}
