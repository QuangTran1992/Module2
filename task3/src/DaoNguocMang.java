import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array ;
        do {
            System.out.println("enter a size");
            size = sc.nextInt();
        }while (size > 20);

    int[] arr = new int[size];
    for ( int i = 0 ; i < size  ; i++  ){
        arr[i] = (int)Math.round(Math.random()*100);
        System.out.print(arr[i]+ " ");
    }
        System.out.println(arr);




    }
}
