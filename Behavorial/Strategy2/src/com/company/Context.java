package com.company;

import com.company.Interfaces.ITransport;

public class Context {
    private ITransport transport;

    public Context(ITransport trans){
        this.transport = trans;
    }

    public Context(){
        this.transport = null;
    }

    public String exec(){
        return transport.performCommute();
    }
}
