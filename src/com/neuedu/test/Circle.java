package com.neuedu.test;

public class Circle {
    private double radius;

    public Circle(double dRadius){
        this.radius = dRadius;
    }

    public double getLength(){
        return 2*Math.PI*this.radius;
    }

    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
}
