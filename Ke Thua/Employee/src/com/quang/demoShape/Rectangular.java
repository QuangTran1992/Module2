package com.quang.demoShape;

public class Rectangular extends Rectangle implements VolumeShape{
    private double height;

    public Rectangular() {
    }

    public Rectangular(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("Volume of Rectangular is :" + getVolume());
    }
}
