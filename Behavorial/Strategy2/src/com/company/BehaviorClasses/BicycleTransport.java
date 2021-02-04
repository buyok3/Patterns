package com.company.BehaviorClasses;

import com.company.TransportType;

public class BicycleTransport extends Transport{
    public BicycleTransport(){
        this.type = TransportType.Bicycle;
    }

    @Override
    public String performCommute(){
        return "Taking " + this.getType().toString() + " to get home, cheapest, but takes a long time";
    }
}
