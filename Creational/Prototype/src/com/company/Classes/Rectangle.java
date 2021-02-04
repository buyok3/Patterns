package com.company.Classes;

import com.company.Shapes;

public class Rectangle extends Shape {
    public Rectangle(int id){
        this.sh = Shapes.Rectangle;
        this.id = id;
    }

    @Override
    public String draw() {
        return "Drawing " + this.sh.toString() + " with id: " + this.id;
    }
}
