import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] arr = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(arr[i][j] + "   ");

            }
            System.out.println("");
        }

//
        int min = arr[0][0];
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j< arr[i].length; j++)
            if (arr[i][j] < min) {
                min = arr[i][j];
                indexX = i;
                indexY = j;
            }
        }
        System.out.println(min);
        System.out.println("index of min is " + indexX + " and " + indexY);
        }

    }