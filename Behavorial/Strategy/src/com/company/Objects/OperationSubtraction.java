package com.company.Objects;

import com.company.Interfaces.Strategy;

public class OperationSubtraction implements Strategy {
    @Override
    public float doAction(int a, int b) {
        return a - b;
    }
}
