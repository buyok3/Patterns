package com.company.TransportLogic;

public class Truck extends Transport {
    // Constructor
    public Truck(String name, int cost) {
        super(name, Type.Truck, cost);
    }

    // Override
    @Override
    public void deliver() {
        System.out.println("Truck delivers stuff on the road");
    }
}
