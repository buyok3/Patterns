package com.company.Factories;

import com.company.TransportLogic.Boat;
import com.company.TransportLogic.Transport;

public class BoatFactory extends Factory{
    // Constructors
    public BoatFactory() {

    }

    // Override
    @Override
    public Transport create(String name, int cost) {
        return new Boat(name, cost);
    }
}
