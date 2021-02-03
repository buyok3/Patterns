package com.company;

import com.company.Factories.BoatFactory;
import com.company.Factories.Factory;
import com.company.Factories.TruckFactory;

public class Main {

    public static void main(String[] args) {
        Factory bf = new BoatFactory();
        Factory tf = new TruckFactory();

        Simulation sim = new Simulation(bf);
        System.out.println(sim.toString());
    }
}
