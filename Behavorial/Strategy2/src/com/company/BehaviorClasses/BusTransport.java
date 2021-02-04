package com.company.BehaviorClasses;

import com.company.TransportType;

public class BusTransport extends Transport {
    public BusTransport(){
        this.type = TransportType.Bus;
    }

    @Override
    public String performCommute(){
        return "Taking " + this.getType().toString()+ " to get home from airport, not expensive, but takes a bit long time\n";
    }
}
