import java.util.Scanner;

public class DoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do C");
        double cel = sc.nextDouble();
        System.out.println("nhap do F");
        double fal = sc.nextDouble();

        System.out.println("Cel to Fal = "+CelToFal(cel));
        System.out.println("f to c"+FalToCel(fal));

// goi 2 ham lamf the nao
    }

    public static double CelToFal(double cel) {
        double fal = (9.0 / 5) * cel + 32;
        return fal;
    }

    public static double  FalToCel(double fal){
     double cel = (5.0 / 9)* (fal -32);
     return  cel;
        }
    }
