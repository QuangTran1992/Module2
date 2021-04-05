import java.util.Scanner;

public class Circle {
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();


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
      public  double AreaCircle(){
        return radius*radius * Math.PI;
    }
    public  double Chuvi(){
        return  radius * 2 * Math.PI;


    }
}
