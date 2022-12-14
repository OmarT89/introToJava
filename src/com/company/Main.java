package com.company;

public class Main {
    public static void main(String[] args) {
//        Your code here
        Point firstPoint = new Point(3.0,4.0);
        Point secondPoint = new Point(7.0, 10.0);

        Line ourLine = new Line(firstPoint, secondPoint);

        System.out.println("Gradient: " + ourLine.gradient());
        System.out.println("Length: " + ourLine.findLength());
    }
}