package com.company.Factories;

import com.company.TransportLogic.Transport;
import com.company.TransportLogic.Truck;

public class TruckFactory extends Factory {
    // Constructor
    public TruckFactory() {

    }

    // Override
    @Override
    public Transport create(String name, int cost) {
        return new Truck(name, cost);
    }
}
