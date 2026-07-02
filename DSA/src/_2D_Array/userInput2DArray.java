package _2D_Array;

import java.util.Scanner;

public class userInput2DArray {
    static void main() {
        int arr[][] =new int[3][4];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Provide value for row=" +i + " and" + " coloumn " + j);
                arr[i][j]=sc.nextInt();

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
