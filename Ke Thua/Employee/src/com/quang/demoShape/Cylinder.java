package com.quang.demoShape;

public class Cylinder extends Circle implements VolumeShape {
    private double heightCylinder;

    public Cylinder() {
    }

    public Cylinder(double radius, double heightCylinder) {
        super(radius);
        this.heightCylinder = heightCylinder;

    }


    public double getHeightCylinder() {
        return heightCylinder;
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    @Override
    public double getVolume() {
        return getArea() * heightCylinder;
    }

    @Override
    public void display() {
        System.out.println("Volume of Cylinder is :" + getVolume());

    }
}
