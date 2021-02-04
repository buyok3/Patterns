package com.company.BehaviorClasses;

import com.company.TransportType;

public class TaxiTransport extends Transport {
    public TaxiTransport(){
        this.type = TransportType.Taxi;
    }

    @Override
    public String performCommute(){
        return "Taking " + this.getType().toString() + " to get home from airport, paying more, but takes less time\n";
    }
}
