package com.company.Classes;

import com.company.Shapes;

public abstract class Shape implements Cloneable{
    protected Shapes sh;
    protected int id;

    public String getShape(){
        return sh.toString();
    }

    public abstract String draw();

    public Object clone(){
        Object obj = null;

        try{
            obj = super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return obj;
    }
}
