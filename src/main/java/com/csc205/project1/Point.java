package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    //Constructor that takes x and y coordinates as double arguments
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Shift a point by an amount along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    //Shift a point by an amount along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    //Finds the distance to point p2
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    //Rotates the point by a specified (radian) angle around the origin
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }


    @Override
    public String toString() {
        return "Point (" + "x = " + x + ", y = " + y + ')';
    }

}