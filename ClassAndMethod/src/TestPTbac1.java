import java.util.Scanner;

public class TestPTbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        double a = sc.nextDouble();
        System.out.println("input b");
        double b = sc.nextDouble();

        PhuongTrinhb1 phuongtrinh1 = new PhuongTrinhb1(a,b);
        phuongtrinh1.GPT();

    }
}
