package com.company;

public class Line {
    private Point startingPoint;
    private Point endingPoint;

    public Line(Point sPoint, Point ePoint){
        this.startingPoint = sPoint;
        this.endingPoint = ePoint;
    }
    public double gradient(){
        double y_diff = this.startingPoint.y - this.endingPoint.y;
        double x_diff = this.startingPoint.x - this.endingPoint.x;
        double grad = y_diff/x_diff;
        return grad;
    }
    public double findLength(){
        double y_diff = Math.pow(this.startingPoint.y - this.endingPoint.y,2);
        double x_diff = Math.pow(this.startingPoint.x - this.endingPoint.x,2);
        double length = Math.sqrt(x_diff + y_diff);
        return length;
    }
}
