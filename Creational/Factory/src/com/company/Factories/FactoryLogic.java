package com.company.Factories;

import com.company.TransportLogic.Transport;

public interface FactoryLogic {
    Transport create(String name, int cost);
}
