package com.quang.demoShape;

public class Circle implements Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void display() {
        System.out.println("Area of Circle is : "+ getArea());
        System.out.println("Perimeter of Circle is :"+ getPerimeter());
    }
}
