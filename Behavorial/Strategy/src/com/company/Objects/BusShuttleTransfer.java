package com.company.Objects;

import com.company.Interfaces.Strategy;
import com.company.Transportation;

public class BusShuttleTransfer implements Strategy {
    @Override
    public String doAction(Transportation trans){
        return "Taking " + trans.toString() + ", and almost missing this freaking bus";
    }
}
