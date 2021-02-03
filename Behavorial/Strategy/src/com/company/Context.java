package com.company;

import com.company.Interfaces.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public float executeOperation(int num1, int num2){
        return strategy.doAction(num1, num2);
    }
}
