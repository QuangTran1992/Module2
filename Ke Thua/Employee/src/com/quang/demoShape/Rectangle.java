package com.quang.demoShape;

public class Rectangle implements Shape {
    private double width;
    double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) *2;
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle is :" + getArea());
        System.out.println("Perimeter of Rectangle is:" + getPerimeter());
    }
}
