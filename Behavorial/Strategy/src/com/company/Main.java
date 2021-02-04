package com.company;

import com.company.Objects.BusShuttleTransfer;
import com.company.Objects.BusTransfer;
import com.company.Objects.CarTransfer;
import com.company.Objects.TaxiTransfer;

public class Main {

    public static void main(String[] args) {
        Context con = new Context(new BusShuttleTransfer());

        System.out.println(con.executeOperation(Transportation.BusShuttle));

        con = new Context(new BusTransfer());
        System.out.println(con.executeOperation(Transportation.Bus));

        con = new Context(new CarTransfer());
        System.out.println(con.executeOperation(Transportation.Car));

        con = new Context(new TaxiTransfer());
        System.out.println(con.executeOperation(Transportation.Taxi));
    }
}
