package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", EmployeesHierarchy.CEO, 30000);
        Employee headSales = new Employee("Jack", EmployeesHierarchy.HeadSales, 25000);
        Employee salesExec = new Employee("Bob", EmployeesHierarchy.SalesExec, 10000);
        Employee salesExec1 = new Employee("Bob 2: Eating shit with this job", EmployeesHierarchy.SalesExec, 10000);

        headSales.add(salesExec);
        headSales.add(salesExec1);

        System.out.println(CEO.toString());
        CEO.add(headSales);

        printSubordinates(CEO);
    }

    public static void printSubordinates(Employee e) {
        if (!e.getSubordinates().isEmpty()){
            for(Employee emp : e.getSubordinates())
                System.out.println(emp.toString());

            for(Employee emp : e.getSubordinates())
                printSubordinates(emp);
        }
    }
}
