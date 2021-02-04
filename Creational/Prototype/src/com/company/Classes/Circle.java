package com.company.Classes;

import com.company.Shapes;

public class Circle extends Shape {
    public Circle(int id){
        this.sh = Shapes.Circle;
        this.id = id;
    }

    @Override
    public String draw() {
        return "Drawing " + this.sh.toString() + " with id: " + this.id;
    }
}
