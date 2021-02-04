package com.company.BehaviorClasses;

import com.company.Interfaces.ITransport;
import com.company.TransportType;

public abstract class Transport implements ITransport {
    protected TransportType type;

    public TransportType getType() {
        return this.type;
    }
}
