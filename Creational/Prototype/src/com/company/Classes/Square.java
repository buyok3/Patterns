package com.company.Classes;

import com.company.Shapes;

public class Square extends Shape {
    public Square(int id){
        this.sh = Shapes.Square;
        this.id = id;
    }

    @Override
    public String draw(){
        return "Drawing " + this.sh.toString() + " with id: " + this.id;
    }
}
