import java.util.Scanner;

public class GtTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");

        int size = 7;

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * 20);
            System.out.print(arr[i] + "  ");
        }

        System.out.println(arr);
        int x = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (x == arr[j]) {
                System.out.println(j);
                break;
            }

        }
    }
}

