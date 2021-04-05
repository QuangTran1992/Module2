import java.util.Scanner;

public class GTMinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for ( int i = 0 ; i < size ; i++ ){
            arr[i] = (int) Math.round(Math.random()*50);
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr);
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if ( arr[i] < min ){
                min = arr[i];

            }

        }
        System.out.println("min of arr is :" +min);
        }

    }

// chua lam for Each dc