package com.company;

import com.company.Interfaces.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeOperation(Transportation trans){
        return strategy.doAction(trans);
    }
}
