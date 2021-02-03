package com.company.Objects;

import com.company.Interfaces.Strategy;
import com.company.Transportation;

public class BusTransfer implements Strategy {
    @Override
    public String doAction(Transportation trans){
        return "Taking " + trans.toString() + " and being cramped with ton of other people";
    }
}
