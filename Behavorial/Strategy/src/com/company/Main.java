package com.company;

import com.company.Objects.OperationAdd;
import com.company.Objects.OperationDivision;
import com.company.Objects.OperationMultiply;
import com.company.Objects.OperationSubtraction;

public class Main {

    public static void main(String[] args) {
        Context con = new Context(new OperationAdd());

        System.out.println(con.executeOperation(5, 10));

        con = new Context(new OperationMultiply());
        System.out.println(con.executeOperation(5, 10));

        con = new Context(new OperationSubtraction());
        System.out.println(con.executeOperation(5, 10));

        con = new Context(new OperationDivision());
        System.out.println(con.executeOperation(5, 10));
    }
}
