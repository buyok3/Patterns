package com.company;

import com.company.Factories.Factory;
import com.company.TransportLogic.Transport;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private World world;
    private final List<Transport> transports = new ArrayList<Transport>();

    // Constructor
    public Simulation(Factory factory) {
        for (int i = 0; i < 10; i++) {
            transports.add(factory.create((i + 1) + ". Transport created by " + factory.getClass().getSimpleName() + " with cost " + ((i + 1) * 10), (i + 1) * 10));
        }

        this.world = new World(transports);
    }

    @Override
    public String toString() {
        String res = "";
        for (Transport t : transports) {
            res += t.getName() + "\n";
        }

        return res;
    }
}
