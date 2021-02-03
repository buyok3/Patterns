package com.company.Objects;

import com.company.Interfaces.Strategy;

public class OperationDivision implements Strategy {
    @Override
    public float doAction(int a, int b) {
        return (float) a / (float) b;
    }
}
