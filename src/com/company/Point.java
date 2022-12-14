package com.company;

public class Point {
    protected double x;
    protected double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getXCoordinate(){
        return this.x;
    }

    public double getYCoordinate(){
        return this.y;
    }
}
