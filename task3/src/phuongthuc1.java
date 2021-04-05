import java.util.Scanner;

public class phuongthuc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * 50);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        System.out.println("total is :"+ Sum(arr));
    }
    static int Sum ( int[] Array){
        int Sum = 0;
        for (int i = 0; i < Array.length; i++) {
            Sum += Array[i];

        }
        return Sum;
    }
}

