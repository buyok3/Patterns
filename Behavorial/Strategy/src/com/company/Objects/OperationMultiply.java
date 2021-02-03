package com.company.Objects;

import com.company.Interfaces.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public float doAction(int a, int b){
        return a * b;
    }
}
