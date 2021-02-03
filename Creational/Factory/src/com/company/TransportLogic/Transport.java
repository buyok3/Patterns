package com.company.TransportLogic;

public abstract class Transport implements TransportLogistic {
    private String name;
    private Type type;
    private int costPerKM;

    // Constructor
    public Transport(String name, Type type, int cost) {
        this.costPerKM = cost;
        this.type = type;
        this.name = name;
    }

    // Getters/Setters

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // type
    public Type getType() {
        return type;
    }

    // cost

    public int getCostPerKM() {
        return costPerKM;
    }

    public void setCostPerKM(int costPerKM) {
        this.costPerKM = costPerKM;

    }
}