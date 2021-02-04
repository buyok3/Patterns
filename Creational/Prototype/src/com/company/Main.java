package com.company;

import com.company.Classes.Circle;
import com.company.Classes.Shape;

public class Main {

    public static void main(String[] args) {
        Shape sh = new Circle(1);
        Shape a;

        System.out.println(sh.draw());

        a = (Shape) sh.clone();

        System.out.println(a.draw());
    }
}
