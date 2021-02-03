package com.company.Objects;

import com.company.Interfaces.Strategy;
import com.company.Transportation;

public class TaxiTransfer implements Strategy {
    @Override
    public String doAction(Transportation trans) {
        return "Taking " + trans.toString() + " to get home, and paying painfully to much";
    }
}
