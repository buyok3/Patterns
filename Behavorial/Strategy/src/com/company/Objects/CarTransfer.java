package com.company.Objects;

import com.company.Interfaces.Strategy;
import com.company.Transportation;

public class CarTransfer implements Strategy {
    @Override
    public String doAction(Transportation trans) {
        return "Taking your " + trans.toString() + " from too expensive parking, for which you paid too much";
    }
}
