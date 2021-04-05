import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("width");
        double width = sc.nextDouble();
        System.out.println("height");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Dien Tich : " + rectangle.DienTich());
    }
}
