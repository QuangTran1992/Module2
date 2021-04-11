package com.quang.demoShape;

public class TestShape {
    public static void main(String[] args) {
//        Circle circle1 = new Circle(10);
//        circle1.display();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10);
        shapes[1] = new Cylinder(10,5);
        shapes[2] = new Rectangular(10,10,5);
        shapes[3] = new Rectangle(10,10);

//        for (Shape s  : shapes
//             ) {
//            System.out.println("*******************");
//
//            s.display();
//
//            System.out.println("");
        for ( int x = 0 ; x <4 ; x++){
            shapes[x].display();
            System.out.println("*******************");
        }
    }
}
