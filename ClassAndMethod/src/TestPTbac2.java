import java.util.Scanner;

public class TestPTbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        double a = sc.nextDouble();

        System.out.println("input b");
        double b = sc.nextDouble();

        System.out.println("input c");
        double c = sc.nextDouble();

        PTbac2 ptbac2 = new PTbac2(a,b,c);
        ptbac2.GPT();



    }
}
