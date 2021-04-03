import java.util.Scanner;

public class UocChungMax {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a");
        a = number.nextInt();
        System.out.println("enter b");
        b = number.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if ( a == 0 || b == 0 )
            System.out.println("No greatest commom factor");
        while ( a != b ) {
            if (a > b)
                a = a - b;

            else
                b = b - a;
        }
        System.out.println("Greatest common factor is : " + a );



    }
}
