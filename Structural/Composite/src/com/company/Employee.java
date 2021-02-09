package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private EmployeesHierarchy dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, EmployeesHierarchy dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee new_emp){
        subordinates.add(new_emp);
    }

    public void remove(Employee emp_to_remove){
        subordinates.remove(emp_to_remove);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nDeparture: " + this.dept.toString() + "\nSalary: " + this.salary + "\n";
    }
}
