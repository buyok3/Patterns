package com.company.TransportLogic;

public class Boat extends Transport {
    // Constructor
    public Boat(String name, int cost) {
        super(name, Type.Boat, cost);
    }

    // Override
    @Override
    public void deliver() {
        System.out.println("Boat delivers stuff on water");
    }
}
